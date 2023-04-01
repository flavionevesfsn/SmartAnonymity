package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.MotionDetector;
import br.com.ontoiot.classes.sensors.PassiveInfrared;

public class DataVehicleDriverPresence {

    private MotionDetector motionDetector;
    private PassiveInfrared passiveInfrared;


    public MotionDetector getMotionDetector() {
        return motionDetector;
    }

    public void setMotionDetector(MotionDetector motionDetector) {
        this.motionDetector = motionDetector;
    }

    public PassiveInfrared getPassiveInfrared() {
        return passiveInfrared;
    }

    public void setPassiveInfrared(PassiveInfrared passiveInfrared) {
        this.passiveInfrared = passiveInfrared;
    }
}
