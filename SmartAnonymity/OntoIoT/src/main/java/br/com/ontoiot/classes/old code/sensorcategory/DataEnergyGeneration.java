package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.*;

public class DataEnergyGeneration {

    private Current current;
    private Galvanometer galvanometer;
    private PhotoDiode photoDiode;
    private StrainGauge strainGauge;
    private TestLight testLight;
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

    public PhotoDiode getPhotoDiode() {
        return photoDiode;
    }

    public void setPhotoDiode(PhotoDiode photoDiode) {
        this.photoDiode = photoDiode;
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

    public WheatstoneBridge getWheatstoneBridge() {
        return wheatstoneBridge;
    }

    public void setWheatstoneBridge(WheatstoneBridge wheatstoneBridge) {
        this.wheatstoneBridge = wheatstoneBridge;
    }
}
