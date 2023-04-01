package br.com.ontoiot;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Csv {
    /**
     * Reading input data from a csv file
     *
     * @param inputFile InputFile
     * @return An inference that is equivalent to an ontology dataset class for category definition.
     */
    public ArrayList<Inferences> readInputData(String inputFile) {
        try {
            Reader reader = Files.newBufferedReader(Paths.get(inputFile));
            CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
            List<String[]> datasets = csvReader.readAll();

            ArrayList<Inferences> inputData = new ArrayList<>();

            for (String[] dataset : datasets) {
                Inferences input = new Inferences();
                input.setSubject(dataset[0]); // Dataset ID
                input.setPredicate("hasSensor"); // Dataset ID
                ArrayList<String> sensorsList = new ArrayList<>(); // SensorsList ID

                for (String sensor : Arrays.copyOfRange(dataset, 1, dataset.length)) {
                    if (!sensor.equals("")) sensorsList.add(sensor);
                }

                input.setObject(sensorsList);
                inputData.add(input);
            }
            return inputData;

        } catch (IOException | CsvException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Writes the ontology results to a csv file.
     *
     * @param scInferences (SensorCategoryInferences) list with the inferences of the category ontology.
     * @param sdInferences (SensorDomainInferences) list with the inferences of the IoT Subdomain ontology.
     */
    public void writeSummaryOutput(String filename, ArrayList<Inferences> scInferences, ArrayList<Inferences> sdInferences) {
        File file = new File(OntoIotUtil.OUTPUTFOLDER + filename + ".csv");
        try {
            FileWriter outfile = new FileWriter(file);
            CSVWriter writer = new CSVWriter(outfile);
            String[] header = {"Dataset", "SensorCategories", "IoTSubdomain", "Inference Type", "Anonymization Algorithm"};
            writer.writeNext(header);

            for (Inferences sdInference : sdInferences) {
                int sensorCategoriesSize = scInferences.get(Integer.parseInt(sdInference.getSubject()) - 1).getObject().size();
                String[] data = {sdInference.getSubject(), String.valueOf(sensorCategoriesSize),
                        sdInference.getObject().get(0), sdInference.getType(), sdInference.getAnonymization()};
                writer.writeNext(data);
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeOutput(ArrayList<Inferences> scInferences, ArrayList<Inferences> sdInferences,
                            ArrayList<SensorAnalysis> unmodeledSensors) {
        writeSummaryOutput("outputSummaryOutputData", scInferences, sdInferences);
        writeOutputCategories("outputCategoriesData", scInferences, sdInferences);
        writeOutputSubdomains("outputSubdomainsData", sdInferences);
        writeOutputDetailedSubdomains("outputDetailedSubdomainsDataCategories", sdInferences);
        writeOutputDetailedSubdomains("outputDetailedSubdomainsDataOccurrence", sdInferences);
        writeOutputDetailedSubdomains("outputDetailedSubdomainsDataAnonymization", sdInferences);
        writeOutputUnmolledSensors("outputDetailedUnmodeledSensors", unmodeledSensors);
    }

    public void writeOutputUnmolledSensors(String filename, ArrayList<SensorAnalysis> unmodeledSensors) {
        File file = new File(OntoIotUtil.OUTPUTFOLDER + filename + ".csv");

        try {
            FileWriter outfile = new FileWriter(file);
            CSVWriter writer = new CSVWriter(outfile);
            String[] header = {"Dataset", "Sensor", "Problables subdomains"};
            writer.writeNext(header);

            for (SensorAnalysis sa : unmodeledSensors) {
                ArrayList<String> categoriesArray = new ArrayList<>();
                categoriesArray.add(sa.getSubject());


                for (HashMap.Entry<String, ArrayList<String>> entry : sa.getOutputSensors().entrySet()) {
                    categoriesArray.add(entry.getKey());
                    categoriesArray.addAll(entry.getValue());
                }

                String[] categoriesString = categoriesArray.toArray(String[]::new);
                writer.writeNext(categoriesString);
            }

            writer.close();

            if (Files.readAllLines(Path.of(OntoIotUtil.OUTPUTFOLDER + filename + ".csv")).size() == 1) {
                new File(OntoIotUtil.OUTPUTFOLDER + filename + ".csv").delete();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void writeOutputCategories(String filename, ArrayList<Inferences> scInferences, ArrayList<Inferences> sdInferences) {
        File file = new File(OntoIotUtil.OUTPUTFOLDER + filename + ".csv");

        try {
            FileWriter outfile = new FileWriter(file);
            CSVWriter writer = new CSVWriter(outfile);
            String[] header = {"Dataset", "Categories"};
            writer.writeNext(header);

            for (Inferences sdInference : sdInferences) {
                ArrayList<String> categoriesArray = new ArrayList<>();
                categoriesArray.add(sdInference.getSubject());

                categoriesArray.addAll(scInferences.get(Integer.parseInt(sdInference.getSubject()) - 1).getObject());

                String[] categoriesString = categoriesArray.toArray(String[]::new);
                writer.writeNext(categoriesString);
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeOutputSubdomains(String filename, ArrayList<Inferences> sdInferences) {
        File file = new File(OntoIotUtil.OUTPUTFOLDER + filename + ".csv");

        try {
            FileWriter outfile = new FileWriter(file);
            CSVWriter writer = new CSVWriter(outfile);
            String[] header = {"Dataset", "Subdomains"};
            writer.writeNext(header);

            for (Inferences sdInference : sdInferences) {
                ArrayList<String> subdomainsArray = new ArrayList<>();
                subdomainsArray.add(sdInference.getSubject());

                subdomainsArray.addAll(sdInference.getObject());

                String[] subdomainsString = subdomainsArray.toArray(String[]::new);
                writer.writeNext(subdomainsString);
            }

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeOutputDetailedSubdomains(String filename, ArrayList<Inferences> sdInferences) {
        File file = new File(OntoIotUtil.OUTPUTFOLDER + filename + ".csv");
        DecimalFormat df = new DecimalFormat("##.##");

        try {
            FileWriter outfile = new FileWriter(file);
            CSVWriter writer = new CSVWriter(outfile);
            String[] header = {"Dataset"};
            writer.writeNext(header);

            for (Inferences sdInference : sdInferences) {
                ArrayList<String> categories = new ArrayList<>();

                if (filename.equals("outputDetailedSubdomainsDataCategories")) {
                    if (sdInference.getEvaluationCategory() != null) {
                        categories.add(sdInference.getSubject());
                        sdInference.getEvaluationCategory().forEach((entry) -> {
                            categories.add(entry.getKey() + " (" + df.format(entry.getValue()) + ")");
                        });

                        writer.writeNext(categories.toArray(String[]::new));
                    }
                } else if (filename.equals("outputDetailedSubdomainsDataOccurrence")) {

                    if (sdInference.getEvaluationOccurrences() != null) {
                        categories.add(sdInference.getSubject());
                        sdInference.getEvaluationOccurrences().forEach((entry) -> {
                            categories.add(entry.getKey() + " (" + df.format(entry.getValue() * 100) + "%)");
                        });

                        writer.writeNext(categories.toArray(String[]::new));
                    }
                } else {
                    if (sdInference.getEvaluationAnonymization() != null) {
                        categories.add(sdInference.getSubject());
                        sdInference.getEvaluationAnonymization().forEach((entry) -> {
                            categories.add(entry.getKey() + " (" + df.format(entry.getValue()) + ")");
                        });

                        writer.writeNext(categories.toArray(String[]::new));
                    }
                }
            }

            writer.close();

            if (Files.readAllLines(Path.of(OntoIotUtil.OUTPUTFOLDER + filename + ".csv")).size() == 1) {
                new File(OntoIotUtil.OUTPUTFOLDER + filename + ".csv").delete();
            }

        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
