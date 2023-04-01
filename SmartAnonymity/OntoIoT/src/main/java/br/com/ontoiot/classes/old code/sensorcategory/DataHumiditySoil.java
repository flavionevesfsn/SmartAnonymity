package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.*;

public class DataHumiditySoil {

    private CapacitanceProbe capacitanceProbe;
    private FrequencyDomain frequencyDomain;
    private Humistor humistor;
    private Hygrometer hygrometer;
    private Lysimeter lysimeter;
    private SoilMoisture soilMoisture;


    public CapacitanceProbe getCapacitanceProbe() {
        return capacitanceProbe;
    }

    public void setCapacitanceProbe(CapacitanceProbe capacitanceProbe) {
        this.capacitanceProbe = capacitanceProbe;
    }

    public FrequencyDomain getFrequencyDomain() {
        return frequencyDomain;
    }

    public void setFrequencyDomain(FrequencyDomain frequencyDomain) {
        this.frequencyDomain = frequencyDomain;
    }

    public Humistor getHumistor() {
        return humistor;
    }

    public void setHumistor(Humistor humistor) {
        this.humistor = humistor;
    }

    public Hygrometer getHygrometer() {
        return hygrometer;
    }

    public void setHygrometer(Hygrometer hygrometer) {
        this.hygrometer = hygrometer;
    }

    public Lysimeter getLysimeter() {
        return lysimeter;
    }

    public void setLysimeter(Lysimeter lysimeter) {
        this.lysimeter = lysimeter;
    }

    public SoilMoisture getSoilMoisture() {
        return soilMoisture;
    }

    public void setSoilMoisture(SoilMoisture soilMoisture) {
        this.soilMoisture = soilMoisture;
    }
}
