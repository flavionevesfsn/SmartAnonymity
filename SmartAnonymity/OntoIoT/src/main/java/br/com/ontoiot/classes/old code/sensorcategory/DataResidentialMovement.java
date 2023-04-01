package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.MotionDetector;
import br.com.ontoiot.classes.sensors.Occupancy;
import br.com.ontoiot.classes.sensors.PassiveInfrared;

public class DataResidentialMovement {

    private MotionDetector motionDetector;
    private Occupancy occupancy;
    private PassiveInfrared passiveInfrared;


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
}
