package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.Impact;
import br.com.ontoiot.classes.sensors.IncrementalEncoder;
import br.com.ontoiot.classes.sensors.Proximity;
import br.com.ontoiot.classes.sensors.Triangulation;

public class DataDoor {

    private Impact impact;
    private IncrementalEncoder incrementalEncoder;
    private Proximity proximity;
    private Triangulation triangulation;


    public Impact getImpact() {
        return impact;
    }

    public void setImpact(Impact impact) {
        this.impact = impact;
    }

    public IncrementalEncoder getIncrementalEncoder() {
        return incrementalEncoder;
    }

    public void setIncrementalEncoder(IncrementalEncoder incrementalEncoder) {
        this.incrementalEncoder = incrementalEncoder;
    }

    public Proximity getProximity() {
        return proximity;
    }

    public void setProximity(Proximity proximity) {
        this.proximity = proximity;
    }

    public Triangulation getTriangulation() {
        return triangulation;
    }

    public void setTriangulation(Triangulation triangulation) {
        this.triangulation = triangulation;
    }
}
