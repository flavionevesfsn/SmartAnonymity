package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.BackIlluminated;
import br.com.ontoiot.classes.sensors.LedAsLight;

public class DataEnvironmentalBrightness {

    private BackIlluminated backIlluminated;
    private LedAsLight ledAsLight;


    public BackIlluminated getBackIlluminated() {
        return backIlluminated;
    }

    public void setBackIlluminated(BackIlluminated backIlluminated) {
        this.backIlluminated = backIlluminated;
    }

    public LedAsLight getLedAsLight() {
        return ledAsLight;
    }

    public void setLedAsLight(LedAsLight ledAsLight) {
        this.ledAsLight = ledAsLight;
    }
}
