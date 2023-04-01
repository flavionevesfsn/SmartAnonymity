package br.com.ontoiot.classes;

import br.com.ontoiot.Inferences;
import br.com.ontoiot.OntoIotUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class oldcode {

    /**
     * Iterate over the inferences specifying the anonymization algorithm.
     *
     * @param sdInferences Subdomain Inferences.

    public void determineAnonymization(ArrayList<Inferences> sdInferences, ArrayList<Inferences> scInferences) {
    for (Inferences inference : sdInferences) {

    if (inference.getConflictingCategories() != null) {
    Map<String, Integer> anonymizationClasses = new HashMap<>();
    Map<String, String> anonymizationKeys = new HashMap<>();

    for (Map.Entry<String, Integer> entry : inference.getConflictingCategories().entrySet()) {
    anonymizationClasses.merge(whichAnonymizationUseAPI(entry.getKey()), 1, Integer::sum);
    anonymizationKeys.merge(whichAnonymizationUseAPI(entry.getKey()), entry.getKey() + " ", String::concat);
    }

    List<String> score = getKeysWithMaxValue(anonymizationClasses);
    ArrayList<String> auxArray = new ArrayList<>();
    if (score.size() == 1) {
    String[] splitString = anonymizationKeys.get(score.get(0)).split(" ");
    String a = "";

    if (splitString.length == 1) {
    a = splitString[0];
    } else if (splitString.length == 2) {
    a = a.concat(splitString[0]);
    a = a.concat(" and " + splitString[1]);
    } else {
    int i = 0;
    for (; i < splitString.length - 2; i++) {
    a = a.concat(splitString[i] + ", ");
    }

    a = a.concat(splitString[i]);
    i++;
    a = a.concat(" and " + splitString[i]);
    }

    auxArray.add(a);
    inference.setObject(auxArray);
    inference.setType("anonymization selection");
    inference.setAnonymization(score.get(0));
    } else {
    inference.setAnonymization(whichAnonymizationUseAPI(inference.getObject().get(0)));
    }
    } else {
    inference.setAnonymization(whichAnonymizationUseAPI(inference.getObject().get(0)));
    }
    }
    }
     */

    /**
     * Determines which anonymize algorithm a subcategory should use.
     *
     * @param subdomain Subdomain name
     * @return The name of the anonymization algorithm.

    public String whichAnonymizationUse(String subdomain) {
    return switch (subdomain) {
    case "Logistic", "IndustrialProcesses", "SmartHome" -> "Ofuscação";
    case "Agriculture", "IndependentLiving", "HealthCare" -> "Pertubação";
    case "Undefined", "SmartGrid", "SecurityPublic" -> "k-anonimato";
    case "UrbanMobility", "SmartCampus" -> "Generalização de Dados";
    default -> "Invalid subdomain";
    };
    }
     */

    /**
     * Determines which anonymize algorithm a subcategory should use.
     *
     * @param subdomain Subdomain name
     * @return The name of the anonymization algorithm.

    public String whichAnonymizationUse(String subdomain) {
    return switch (subdomain) {
    case "Logistic", "IndustrialProcesses", "SmartHome" -> "0";
    case "Agriculture", "IndependentLiving", "HealthCare" -> "1";
    case "Undefined", "SmartGrid", "SecurityPublic" -> "2";
    case "UrbanMobility", "SmartCampus" -> "3";
    default -> "4";
    };
    }
     */

    /*
    public boolean determineSubdomainBySensors(Inferences inputData, Inferences ctI) {
        if (howManyObjects(inputData) == 1) { // There is only one sensor?
            return false;
        } else {
            Map<String, Integer> score = new HashMap<>();
            for (String categoryName : ctI.getObject()) {
                Categories cC = loadCategory(getCategoriesClasses(), categoryName);

                int nSensors = 0;
                // Load sensors from a given subdomain
                for (String c : inputData.getObject()) {
                    // If the subdomain has the category, count it.
                    if (cC.getSensorCategories().contains(c)) nSensors++;
                }
                score.put(categoryName, nSensors); // save the count
            }
            List<String> probableCategories = getKeysWithMaxValue(score);

            return probableCategories.size() == 1;
        }
    }*/

    /**
     * Get a category
     *
     * @param categories   List of categories
     * @param categoryName categoryName
     * @return a category

    public Categories loadCategory(ArrayList<Categories> categories, String categoryName) {
    for (Categories category : categories) {
    if (categoryName.equals(category.getName())) {
    return category;
    }
    }

    return null;
    }
     */

    /*
       public List<String> getKeysWithMaxValue(Map<String, Integer> mapList) {
        final List<String> resultList = new ArrayList<>();
        int currentMaxValue = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : mapList.entrySet()) {
            if (entry.getValue() > currentMaxValue) {
                resultList.clear();
                resultList.add(entry.getKey());
                currentMaxValue = entry.getValue();
            } else if (entry.getValue() == currentMaxValue) {
                resultList.add(entry.getKey());
            }
        }
        return resultList;
    }
     */

    /*
    public void determineIoTCategoryBasedOnOccurrencesOld(ArrayList<Inferences> scInferences, ArrayList<Inferences> sdInferences) {
        for (Inferences sdi : sdInferences) {
            if (sdi.getType() == null) {
                ArrayList<String> inferenceCategories = scInferences.get(Integer.parseInt(sdi.getSubject()) - 1).getObject();
                HashMap<String, Float> percentagePerSubdomain = new HashMap<>();

                for (String subdomain : sdi.getObject()) {
                    ArrayList<String> subdomainCategories = OntoIotUtil.SUBDOMAINS.get(subdomain);
                    float percentage = (float) intersectForeach(inferenceCategories, subdomainCategories).length / subdomainCategories.size();
                    percentagePerSubdomain.put(subdomain, percentage);
                }

                List<String> probableSubdomains = getKeysWithMaxValueFloat(percentagePerSubdomain);

                if ((probableSubdomains.size() == 1) && sortedHashMapDecreasing(percentagePerSubdomain).findFirst().get().getValue() >= 0.5) {
                    sdi.setObject(new ArrayList<>(List.of(probableSubdomains.get(0))));
                    sdi.setType("Percentage");
                    sdi.setEvaluationOccurrences(sortedHashMapDecreasing(percentagePerSubdomain));
                }
            }
        }
    }*/
}
