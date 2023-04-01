package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.Impact;
import br.com.ontoiot.classes.sensors.ShockDetector;

public class DataQualityProduct {

    private Impact impact;
    private ShockDetector shockDetector;


    public Impact getImpact() {
        return impact;
    }

    public void setImpact(Impact impact) {
        this.impact = impact;
    }

    public ShockDetector getShockDetector() {
        return shockDetector;
    }

    public void setShockDetector(ShockDetector shockDetector) {
        this.shockDetector = shockDetector;
    }
}
