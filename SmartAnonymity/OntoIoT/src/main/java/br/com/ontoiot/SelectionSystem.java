package br.com.ontoiot;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.*;

import static java.util.Collections.reverseOrder;

public class SelectionSystem {

    public static boolean intersectForGroup(ArrayList<String> arr1, ArrayList<ArrayList<String>> arr2) {
        ArrayList<String> result;

        for (ArrayList<String> ai2 : arr2) {
            result = new ArrayList<>();

            for (String a1 : arr1) {
                for (String a2 : ai2) {
                    if (a1.equals(a2)) result.add(a1);
                }
            }

            if (arr1.equals(result)) return true;
        }

        return false;
    }

    public static String[] intersectForeach(ArrayList<String> arr1, ArrayList<String> arr2) {
        ArrayList<String> result = new ArrayList<>();

        for (String a1 : arr1) {
            for (String a2 : arr2) {
                if (a1.equals(a2))
                    result.add(a1);
            }
        }

        return result.toArray(new String[0]);
    }

    /**
     * It determines the subdomain and then the anonymization algorithm by inference.
     *
     * @param sensors              List of sensors by dataset.
     * @param categoriesInferences List of inferred categories by dataset.
     * @param subdomainInferences  List of inferred subdomains by dataset.
     */
    public void determineIotSubdomain(ArrayList<Inferences> sensors, ArrayList<Inferences> categoriesInferences,
                                      ArrayList<Inferences> subdomainInferences) {

        determineByOntology(subdomainInferences);
        determineIfHasOnlyAUndefinedSensor(sensors, categoriesInferences, subdomainInferences);
        determineIoTCategoryBasedOnOccurrences(categoriesInferences, subdomainInferences);
        determineSubdomainWithTheMostCategories(categoriesInferences, subdomainInferences);
        determineAnonymizationByGroup(categoriesInferences, subdomainInferences);
        determineUndefinedSubdomains(subdomainInferences);
    }


    public HashMap<String, Float> determineLikelySubdomainsByCategories(ArrayList<Inferences> scInferences, Inferences inference) {
        HashMap<String, Float> score = new HashMap<>();
        int sdiId = convertStringToInt(inference.getSubject()) - 1;

        for (String subdomainName : inference.getObject()) { // Iterate over them
            score.put(subdomainName, (float) intersectForeach(OntoIotUtil.SUBDOMAINS.get(subdomainName),
                    selectInferenceObjectsById(scInferences, sdiId)).length);
        }

        return score;
    }

    public void determineAnonymizationByGroup(ArrayList<Inferences> scInferences,
                                              ArrayList<Inferences> sdInferences) {
        for (Inferences sdi : sdInferences) {
            if (sdi.getType() == null) {
                HashMap<String, Float> score = determineLikelySubdomainsByCategories(scInferences, sdi);
                List<String> probableSubdomains = getKeysWithMaxValueFloat(score);

                ArrayList<ArrayList<String>> subdomains = OntoIotUtil.SUBDOMAINSANDANONIMIZATION;

                if (intersectForGroup(new ArrayList<>(probableSubdomains), subdomains)) {
                    sdi.setObject(new ArrayList<>(probableSubdomains));
                    sdi.setType("anonymization");
                    sdi.setEvaluationAnonymization(sortedHashMapDecreasing(score));
                }
            }
        }
    }

    public void determineUndefinedSubdomains(ArrayList<Inferences> sdInferences) {
        for (Inferences sdi : sdInferences) {
            if (sdi.getType() == null) {
                sdi.setType("Undefined");
                sdi.setObject(new ArrayList<>(List.of("Undefined")));
            }
        }
    }

    public void determineByOntology(ArrayList<Inferences> sdInferences) {
        for (Inferences sdi : sdInferences) {
            if (howManyObjects(sdi) == 1) { // How many subdomains does this inference have?
                sdi.setType("Ontology");
            }
        }
    }

    public Stream<Map.Entry<String, Float>> sortedHashMapDecreasing(HashMap<String, Float> map) {
        return map.entrySet().stream().sorted(reverseOrder(Map.Entry.comparingByValue()));
    }

    public List<String> betterPercentageMap(HashMap<String, Float> map, float value) {
        return map.entrySet().stream().filter(entry -> Objects.equals(entry.getValue(), value)).map(Map.Entry::getKey).collect(Collectors.toList());
    }

    public void determineIoTCategoryBasedOnOccurrences(ArrayList<Inferences> scInferences, ArrayList<Inferences> sdInferences) {
        for (Inferences sdi : sdInferences) {
            if (sdi.getType() == null) {
                int sdiId = convertStringToInt(sdi.getSubject()) - 1;
                ArrayList<String> inferenceCategories = selectInferenceObjectsById(scInferences, sdiId);

                HashMap<String, Float> percentagePerSubdomain = new HashMap<>();

                for (String subdomain : sdi.getObject()) {
                    ArrayList<String> subdomainCategories = OntoIotUtil.SUBDOMAINS.get(subdomain);
                    float percentage = (float) intersectForeach(inferenceCategories, subdomainCategories).length / subdomainCategories.size();
                    percentagePerSubdomain.put(subdomain, percentage);
                }

                float firstValue = sortedHashMapDecreasing(percentagePerSubdomain).findFirst().get().getValue();

                ArrayList<String> probableSubdomains = new ArrayList<>();

                for (Map.Entry<String, Float> percentage : sortedHashMapDecreasing(percentagePerSubdomain).toList()) {
                    if ((firstValue - percentage.getValue()) <= 0.1) {
                        probableSubdomains.add(percentage.getKey());
                    } else {
                        break;
                    }
                }

                if (firstValue >= 0.5) {
                    if (probableSubdomains.size() == 1) {
                        sdi.setObject(new ArrayList<>(List.of(probableSubdomains.get(0))));
                        sdi.setType("Percentage");
                        sdi.setEvaluationOccurrences(sortedHashMapDecreasing(percentagePerSubdomain));
                    } else {
                        HashMap<String, Float> percentageSubdomains = new HashMap<>();

                        for (String subdomain : probableSubdomains) {
                            ArrayList<String> subdomainCategories = OntoIotUtil.SUBDOMAINS.get(subdomain);
                            float percentage = (float) intersectForeach(inferenceCategories, subdomainCategories).length
                                    / subdomainCategories.size();
                            percentageSubdomains.put(subdomain, percentage);
                        }

                        float better_value = percentageSubdomains.get(probableSubdomains.get(0)).floatValue();

                        if (betterPercentageMap(percentageSubdomains, better_value).size() == 1) {
                            sdi.setObject(new ArrayList<>(List.of(probableSubdomains.get(0))));
                            sdi.setType("Percentage");
                            sdi.setEvaluationOccurrences(sortedHashMapDecreasing(percentagePerSubdomain));
                        }
                    }
                }
            }
        }
    }

    public void determineAnonymizationAlgorithm(ArrayList<Inferences> sdInferences) {
        for (Inferences inference : sdInferences) {
            inference.setAnonymization(whichAnonymizationUseAPI(inference.getObject().get(0)));
        }
    }

    public String whichAnonymizationUseAPI(String subdomain) {

        HttpPost post = new HttpPost("http://localhost:12345/classifier/");

        List<NameValuePair> urlParameters = new ArrayList<>();
        urlParameters.add(new BasicNameValuePair("data", subdomain));

        try {
            post.setEntity(new UrlEncodedFormEntity(urlParameters));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(post)) {

            return EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";

    }

    /**
     * Determines which subdomain each dataset belongs to using ontology inferences
     * First, it evaluates whether the ontology itself was able to find the subdomain.
     * If not, try to determine the subdomain using categories, sensors or arbitrary choice.
     *
     * @param scInferences List of inferred categories by dataset.
     * @param sdInferences List of inferred subdomains by dataset.
     */
    public void determineSubdomainWithTheMostCategories(ArrayList<Inferences> scInferences,
                                                        ArrayList<Inferences> sdInferences) {
        for (Inferences sdi : sdInferences) {
            if (sdi.getType() == null) { // How many subdomains does this inference have?

                HashMap<String, Float> score = determineLikelySubdomainsByCategories(scInferences, sdi);
                List<String> probableSubdomains = getKeysWithMaxValueFloat(score);

                // are there two subdomains with the same amount of categories?
                if (probableSubdomains.size() == 1) {
                    sdi.setObject(new ArrayList<>(List.of(probableSubdomains.get(0))));
                    sdi.setType("categories");
                    sdi.setEvaluationCategory(sortedHashMapDecreasing(score));
                }
            }
        }
    }

    public void determineIfHasOnlyAUndefinedSensor(ArrayList<Inferences> sensors, ArrayList<Inferences> categoriesInferences,
                                                   ArrayList<Inferences> subdomainInferences) {
        ArrayList<String> undefinedSubdomain = new ArrayList<>();
        undefinedSubdomain.add("Undefined");

        ArrayList<String> undefinedCategories = new ArrayList<>();
        undefinedCategories.add("DataUndefined");

        for (Inferences inference : sensors) {
            if (inference.getObject().size() == 1) {
                String sensor = inference.getObject().get(0);
                if (sensor.equals("Undefined")) {
                    subdomainInferences.get(Integer.parseInt(inference.getSubject()) - 1).setType("specification");
                    subdomainInferences.get(Integer.parseInt(inference.getSubject()) - 1).setObject(undefinedSubdomain);
                    categoriesInferences.get(Integer.parseInt(inference.getSubject()) - 1).setObject(undefinedCategories);
                }
            }
        }
    }

    /**
     * Return the highest-valued float key.
     *
     * @param mapList A map of floats keys.
     * @return the highest float key.
     */
    public List<String> getKeysWithMaxValueFloat(Map<String, Float> mapList) {
        final List<String> resultList = new ArrayList<>();
        Float currentMaxValue = Float.MIN_VALUE;
        for (Map.Entry<String, Float> entry : mapList.entrySet()) {
            if (entry.getValue() > currentMaxValue) {
                resultList.clear();
                resultList.add(entry.getKey());
                currentMaxValue = entry.getValue();
            } else if (entry.getValue().equals(currentMaxValue)) {
                resultList.add(entry.getKey());
            }
        }
        return resultList;
    }

    /**
     * Convert a String to an Integer
     *
     * @param number a String number
     * @return an int number
     */
    public int convertStringToInt(String number) {
        return Integer.parseInt(number);
    }

    /**
     * Select an inference according to its id (dataset number).
     *
     * @param inferenceId inferenceId
     * @return A given inference
     */
    public ArrayList<String> selectInferenceObjectsById(ArrayList<Inferences> inferences, int inferenceId) {
        return inferences.get(inferenceId).getObject();
    }


    /**
     * Returns how many objects a given inference has. e.g., ActivePixel has 3 categories
     *
     * @param inference A class with inferences.
     * @return 3 categories
     */
    public int howManyObjects(Inferences inference) {
        return inference.getObject().size();
    }
}
