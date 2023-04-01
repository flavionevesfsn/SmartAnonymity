package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.CapacitiveSensing;
import br.com.ontoiot.classes.sensors.Electroscope;
import br.com.ontoiot.classes.sensors.TouchSwitch;

public class DataSocketsUse {

    private CapacitiveSensing capacitiveSensing;
    private Electroscope electroscope;
    private TouchSwitch touchSwitch;


    public CapacitiveSensing getCapacitiveSensing() {
        return capacitiveSensing;
    }

    public void setCapacitiveSensing(CapacitiveSensing capacitiveSensing) {
        this.capacitiveSensing = capacitiveSensing;
    }

    public Electroscope getElectroscope() {
        return electroscope;
    }

    public void setElectroscope(Electroscope electroscope) {
        this.electroscope = electroscope;
    }

    public TouchSwitch getTouchSwitch() {
        return touchSwitch;
    }

    public void setTouchSwitch(TouchSwitch touchSwitch) {
        this.touchSwitch = touchSwitch;
    }
}
