package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.MotionDetector;
import br.com.ontoiot.classes.sensors.Occupancy;
import br.com.ontoiot.classes.sensors.PassiveInfrared;
import br.com.ontoiot.classes.sensors.Proximity;

public class DataPresence {

    private MotionDetector motionDetector;
    private Occupancy occupancy;
    private PassiveInfrared passiveInfrared;
    private Proximity proximity;


    public MotionDetector getMotionDetector() {
        return motionDetector;
    }

    public void setMotionDetector(MotionDetector motionDetector) {
        this.motionDetector = motionDetector;
    }

    public Occupancy getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(Occupancy occupancy) {
        this.occupancy = occupancy;
    }

    public PassiveInfrared getPassiveInfrared() {
        return passiveInfrared;
    }

    public void setPassiveInfrared(PassiveInfrared passiveInfrared) {
        this.passiveInfrared = passiveInfrared;
    }

    public Proximity getProximity() {
        return proximity;
    }

    public void setProximity(Proximity proximity) {
        this.proximity = proximity;
    }
}
