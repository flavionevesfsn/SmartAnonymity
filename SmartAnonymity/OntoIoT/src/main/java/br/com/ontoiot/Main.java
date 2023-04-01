package br.com.ontoiot;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Csv csv = new Csv();
        OntoIot ontoIot = new OntoIot();
        SensorAnalysis sa = new SensorAnalysis();

        ArrayList<Inferences> sensors = csv.readInputData(OntoIotUtil.INPUTFOLDER + "inputCategories.csv");
        System.out.println(sensors);
        ArrayList<SensorAnalysis> unmodeledSensors = sa.determineIfThereAreUnmodeledSensors(sensors);
        System.out.println(unmodeledSensors);

        ArrayList<Inferences> scInferences = ontoIot.inferSensorCategories(sensors);
        ArrayList<Inferences> sdInferences = ontoIot.inferSubDomain(scInferences);

        SelectionSystem ss = new SelectionSystem();
        ss.determineIotSubdomain(sensors, scInferences, sdInferences);
        ss.determineAnonymizationAlgorithm(sdInferences);

        sa.classifyASensorIntoACategory(sdInferences, unmodeledSensors);
        csv.writeOutput(scInferences, sdInferences, unmodeledSensors);



    }
}
