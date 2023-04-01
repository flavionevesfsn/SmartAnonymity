package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.*;

public class DataSecurityAlarms {

    private Proximity proximity;
    private Alarm alarm;
    private GasDetector gasDetector;
    private MillimeterWaveScanner millimeterWaveScanner;
    private PassiveInfrared passiveInfrared;


    public Proximity getProximity() {
        return proximity;
    }

    public void setProximity(Proximity proximity) {
        this.proximity = proximity;
    }

    public Alarm getAlarm() {
        return alarm;
    }

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    public GasDetector getGasDetector() {
        return gasDetector;
    }

    public void setGasDetector(GasDetector gasDetector) {
        this.gasDetector = gasDetector;
    }

    public MillimeterWaveScanner getMillimeterWaveScanner() {
        return millimeterWaveScanner;
    }

    public void setMillimeterWaveScanner(MillimeterWaveScanner millimeterWaveScanner) {
        this.millimeterWaveScanner = millimeterWaveScanner;
    }

    public PassiveInfrared getPassiveInfrared() {
        return passiveInfrared;
    }

    public void setPassiveInfrared(PassiveInfrared passiveInfrared) {
        this.passiveInfrared = passiveInfrared;
    }
}
