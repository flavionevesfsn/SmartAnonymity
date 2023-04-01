package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.*;

public class DataEnergyStorage {

    private Current current;
    private Galvanometer galvanometer;
    private StrainGauge strainGauge;
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

    public StrainGauge getStrainGauge() {
        return strainGauge;
    }

    public void setStrainGauge(StrainGauge strainGauge) {
        this.strainGauge = strainGauge;
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
