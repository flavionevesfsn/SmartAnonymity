package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.*;

public class DataEnergyConsumption {

    private Current current;
    private Galvanometer galvanometer;
    private ProportionalCounter proportionalCounter;
    private StrainGauge strainGauge;
    private TestLight testLight;
    private VoltageDetector voltageDetector;
    private WheatstoneBridge wheatstoneBridge;


    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public Galvanometer getGalvanometer() {
        return galvanometer;
    }

    public void setGalvanometer(Galvanometer galvanometer) {
        this.galvanometer = galvanometer;
    }

    public ProportionalCounter getProportionalCounter() {
        return proportionalCounter;
    }

    public void setProportionalCounter(ProportionalCounter proportionalCounter) {
        this.proportionalCounter = proportionalCounter;
    }

    public StrainGauge getStrainGauge() {
        return strainGauge;
    }

    public void setStrainGauge(StrainGauge strainGauge) {
        this.strainGauge = strainGauge;
    }

    public TestLight getTestLight() {
        return testLight;
    }

    public void setTestLight(TestLight testLight) {
        this.testLight = testLight;
    }

    public VoltageDetector getVoltageDetector() {
        return voltageDetector;
    }

    public void setVoltageDetector(VoltageDetector voltageDetector) {
        this.voltageDetector = voltageDetector;
    }

    public WheatstoneBridge getWheatstoneBridge() {
        return wheatstoneBridge;
    }

    public void setWheatstoneBridge(WheatstoneBridge wheatstoneBridge) {
        this.wheatstoneBridge = wheatstoneBridge;
    }
}
