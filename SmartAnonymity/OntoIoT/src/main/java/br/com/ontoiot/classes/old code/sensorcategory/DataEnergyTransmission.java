package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.Current;
import br.com.ontoiot.classes.sensors.Galvanometer;
import br.com.ontoiot.classes.sensors.StrainGauge;
import br.com.ontoiot.classes.sensors.WheatstoneBridge;

public class DataEnergyTransmission {

    private Current current;
    private Galvanometer galvanometer;
    private StrainGauge strainGauge;
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

    public WheatstoneBridge getWheatstoneBridge() {
        return wheatstoneBridge;
    }

    public void setWheatstoneBridge(WheatstoneBridge wheatstoneBridge) {
        this.wheatstoneBridge = wheatstoneBridge;
    }
}
