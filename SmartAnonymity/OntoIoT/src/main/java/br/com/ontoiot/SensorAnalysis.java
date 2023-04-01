package br.com.ontoiot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SensorAnalysis {

    private String subject;
    private HashMap<String, Integer> unmodeledSensors;
    private HashMap<String, ArrayList<String>> outputSensors;

    public HashMap<String, ArrayList<String>> getOutputSensors() {
        return outputSensors;
    }

    public void setOutputSensors(HashMap<String, ArrayList<String>> outputSensors) {
        this.outputSensors = outputSensors;
    }

    public ArrayList<SensorAnalysis> determineIfThereAreUnmodeledSensors(ArrayList<Inferences> inputSensors) {
        OntoIot ontoIot = new OntoIot();

        ArrayList<String> sensors = ontoIot.loadOntologyClassesPerPackage("br.com.ontoiot.classes.sensors", "simple");
        ArrayList<SensorAnalysis> unmodeledSensors = new ArrayList<>();

        for (Inferences inference : inputSensors) {
            SensorAnalysis sa = new SensorAnalysis();
            sa.setSubject(inference.getSubject());

            HashMap<String, Integer> us = new HashMap<>();

            for (int i = 0; i < inference.getObject().size(); i++) {
                String sensor = inference.getObject().get(i);
                if (!sensors.contains(sensor)) {
                    us.put(sensor, 0);
                }
            }

            for (HashMap.Entry<String, Integer> entry : us.entrySet()) {
                inference.getObject().remove(entry.getKey());
                inference.getObject().add("Undefined");
            }

            sa.setUnmodeledSensors(us);
            unmodeledSensors.add(sa);
        }

        unmodeledSensors.removeIf(us -> us.getUnmodeledSensors().size() == 0);

        return unmodeledSensors;
    }

    public void classifyASensorIntoACategory(ArrayList<Inferences> sdInferences, ArrayList<SensorAnalysis> unmolledSensors) {


        for (SensorAnalysis unmolledSensor : unmolledSensors) {
            HashMap<String, ArrayList<String>> outputSensors = new HashMap<>();
            ArrayList<String> sub = sdInferences.get(Integer.parseInt(unmolledSensor.getSubject()) - 1).getObject();

            for (Map.Entry<String, Integer> entry : unmolledSensor.getUnmodeledSensors().entrySet()) {
                outputSensors.put(entry.getKey(), sub);
            }

            unmolledSensor.setOutputSensors(outputSensors);
        }
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public HashMap<String, Integer> getUnmodeledSensors() {
        return unmodeledSensors;
    }

    public void setUnmodeledSensors(HashMap<String, Integer> unmodeledSensors) {
        this.unmodeledSensors = unmodeledSensors;
    }

    @Override
    public String toString() {
        return "SensorAnalysis{" +
                "subject='" + subject + '\'' +
                ", unmodeledSensors=" + unmodeledSensors +
                ", outputSensors=" + outputSensors +
                '}';
    }

    public void printUnmodeledSensors(ArrayList<SensorAnalysis> unmodeledSensors) {

        if (unmodeledSensors.size() != 0) {
            System.out.println("Unmodeled sensors inserted into the input");
            for (SensorAnalysis sa : unmodeledSensors) {
                System.out.print("Dataset " + sa.getSubject() + ": [");

                Iterator<Map.Entry<String, Integer>> it = sa.getUnmodeledSensors().entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, Integer> us = it.next();

                    if (!it.hasNext()) {
                        System.out.print(us.getKey().replace(" ", ""));
                    } else {
                        System.out.print(us.getKey().replace(" ", "") + ", ");
                    }
                }

                System.out.println("]");
            }

            System.out.println();
        }
    }
}
