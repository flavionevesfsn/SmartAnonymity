package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.Impact;
import br.com.ontoiot.classes.sensors.Nano;
import br.com.ontoiot.classes.sensors.ShockDetector;

public class DataDangerousGoods {

    private Impact impact;
    private Nano nano;
    private ShockDetector shockDetector;


    public Impact getImpact() {
        return impact;
    }

    public void setImpact(Impact impact) {
        this.impact = impact;
    }

    public Nano getNano() {
        return nano;
    }

    public void setNano(Nano nano) {
        this.nano = nano;
    }

    public ShockDetector getShockDetector() {
        return shockDetector;
    }

    public void setShockDetector(ShockDetector shockDetector) {
        this.shockDetector = shockDetector;
    }
}
