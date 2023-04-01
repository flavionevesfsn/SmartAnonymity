package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.*;

public class DataAutomationLighting {

    private ElectroOptical electroOptical;
    private IncrementalEncoder incrementalEncoder;
    private LedAsLight ledAsLight;
    private Light light;
    private PassiveInfrared passiveInfrared;


    public ElectroOptical getElectroOptical() {
        return electroOptical;
    }

    public void setElectroOptical(ElectroOptical electroOptical) {
        this.electroOptical = electroOptical;
    }

    public IncrementalEncoder getIncrementalEncoder() {
        return incrementalEncoder;
    }

    public void setIncrementalEncoder(IncrementalEncoder incrementalEncoder) {
        this.incrementalEncoder = incrementalEncoder;
    }

    public LedAsLight getLedAsLight() {
        return ledAsLight;
    }

    public void setLedAsLight(LedAsLight ledAsLight) {
        this.ledAsLight = ledAsLight;
    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    public PassiveInfrared getPassiveInfrared() {
        return passiveInfrared;
    }

    public void setPassiveInfrared(PassiveInfrared passiveInfrared) {
        this.passiveInfrared = passiveInfrared;
    }
}
