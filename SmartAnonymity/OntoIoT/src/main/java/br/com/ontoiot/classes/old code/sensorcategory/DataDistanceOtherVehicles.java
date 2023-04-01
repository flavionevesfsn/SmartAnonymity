package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.BlindSpotMonitor;
import br.com.ontoiot.classes.sensors.CapacitiveDisplacement;
import br.com.ontoiot.classes.sensors.Position;
import br.com.ontoiot.classes.sensors.Proximity;

public class DataDistanceOtherVehicles {

    private BlindSpotMonitor blindSpotMonitor;
    private CapacitiveDisplacement capacitiveDisplacement;
    private Position position;
    private Proximity proximity;


    public BlindSpotMonitor getBlindSpotMonitor() {
        return blindSpotMonitor;
    }

    public void setBlindSpotMonitor(BlindSpotMonitor blindSpotMonitor) {
        this.blindSpotMonitor = blindSpotMonitor;
    }

    public CapacitiveDisplacement getCapacitiveDisplacement() {
        return capacitiveDisplacement;
    }

    public void setCapacitiveDisplacement(CapacitiveDisplacement capacitiveDisplacement) {
        this.capacitiveDisplacement = capacitiveDisplacement;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Proximity getProximity() {
        return proximity;
    }

    public void setProximity(Proximity proximity) {
        this.proximity = proximity;
    }
}
