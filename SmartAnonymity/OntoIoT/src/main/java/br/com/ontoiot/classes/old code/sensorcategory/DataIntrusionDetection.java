package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.*;

public class DataIntrusionDetection {

    private Alarm alarm;
    private Microphone microphone;
    private MillimeterWaveScanner millimeterWaveScanner;
    private MotionDetector motionDetector;
    private Occupancy occupancy;
    private PassiveInfrared passiveInfrared;


    public Alarm getAlarm() {
        return alarm;
    }

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    public Microphone getMicrophone() {
        return microphone;
    }

    public void setMicrophone(Microphone microphone) {
        this.microphone = microphone;
    }

    public MillimeterWaveScanner getMillimeterWaveScanner() {
        return millimeterWaveScanner;
    }

    public void setMillimeterWaveScanner(MillimeterWaveScanner millimeterWaveScanner) {
        this.millimeterWaveScanner = millimeterWaveScanner;
    }

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
