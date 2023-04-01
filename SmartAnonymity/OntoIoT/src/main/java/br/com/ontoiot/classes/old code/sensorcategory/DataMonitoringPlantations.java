package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.Auxanometer;
import br.com.ontoiot.classes.sensors.Hyperspectral;
import br.com.ontoiot.classes.sensors.Leaf;
import br.com.ontoiot.classes.sensors.Nano;

public class DataMonitoringPlantations {

    private Auxanometer auxanometer;
    private Hyperspectral hyperspectral;
    private Leaf leaf;
    private Nano nano;


    public Auxanometer getAuxanometer() {
        return auxanometer;
    }

    public void setAuxanometer(Auxanometer auxanometer) {
        this.auxanometer = auxanometer;
    }

    public Hyperspectral getHyperspectral() {
        return hyperspectral;
    }

    public void setHyperspectral(Hyperspectral hyperspectral) {
        this.hyperspectral = hyperspectral;
    }

    public Leaf getLeaf() {
        return leaf;
    }

    public void setLeaf(Leaf leaf) {
        this.leaf = leaf;
    }

    public Nano getNano() {
        return nano;
    }

    public void setNano(Nano nano) {
        this.nano = nano;
    }
}
