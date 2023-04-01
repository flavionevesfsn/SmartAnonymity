package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.Alarm;
import br.com.ontoiot.classes.sensors.MillimeterWaveScanner;
import br.com.ontoiot.classes.sensors.MotionDetector;

public class DataAccessManagement {
    private Alarm alarm;
    private MillimeterWaveScanner millimeterWaveScanner;
    private MotionDetector motionDetector;

    public Alarm getAlarm() {
        return alarm;
    }

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
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
}
