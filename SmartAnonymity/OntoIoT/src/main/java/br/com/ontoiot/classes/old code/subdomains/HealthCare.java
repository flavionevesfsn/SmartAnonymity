package br.com.ontoiot.classes.subdomains;

import br.com.ontoiot.classes.sensorcategory.DataPersonalAssistants;
import br.com.ontoiot.classes.sensorcategory.DataPhysicalExercises;
import br.com.ontoiot.classes.sensorcategory.DataPhysiologicalSigns;
import br.com.ontoiot.classes.sensorcategory.DataSleepMonitoring;

public class HealthCare {

    private DataPersonalAssistants dataPersonalAssistants;
    private DataPhysicalExercises dataPhysicalExercises;
    private DataPhysiologicalSigns dataPhysiologicalSigns;
    private DataSleepMonitoring dataSleepMonitoring;

    public DataPersonalAssistants getDataPersonalAssistants() {
        return dataPersonalAssistants;
    }

    public void setDataPersonalAssistants(DataPersonalAssistants dataPersonalAssistants) {
        this.dataPersonalAssistants = dataPersonalAssistants;
    }

    public DataPhysicalExercises getDataPhysicalExercises() {
        return dataPhysicalExercises;
    }

    public void setDataPhysicalExercises(DataPhysicalExercises dataPhysicalExercises) {
        this.dataPhysicalExercises = dataPhysicalExercises;
    }

    public DataPhysiologicalSigns getDataPhysiologicalSigns() {
        return dataPhysiologicalSigns;
    }

    public void setDataPhysiologicalSigns(DataPhysiologicalSigns dataPhysiologicalSigns) {
        this.dataPhysiologicalSigns = dataPhysiologicalSigns;
    }

    public DataSleepMonitoring getDataSleepMonitoring() {
        return dataSleepMonitoring;
    }

    public void setDataSleepMonitoring(DataSleepMonitoring dataSleepMonitoring) {
        this.dataSleepMonitoring = dataSleepMonitoring;
    }
}
