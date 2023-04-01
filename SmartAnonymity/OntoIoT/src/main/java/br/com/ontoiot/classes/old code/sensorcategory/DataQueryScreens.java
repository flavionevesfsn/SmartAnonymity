package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.Capacitance;
import br.com.ontoiot.classes.sensors.PiezoElectric;
import br.com.ontoiot.classes.sensors.TouchSwitch;

public class DataQueryScreens {

    private Capacitance capacitance;
    private PiezoElectric piezoElectric;
    private TouchSwitch touchSwitch;


    public Capacitance getCapacitance() {
        return capacitance;
    }

    public void setCapacitance(Capacitance capacitance) {
        this.capacitance = capacitance;
    }

    public PiezoElectric getPiezoElectric() {
        return piezoElectric;
    }

    public void setPiezoElectric(PiezoElectric piezoElectric) {
        this.piezoElectric = piezoElectric;
    }

    public TouchSwitch getTouchSwitch() {
        return touchSwitch;
    }

    public void setTouchSwitch(TouchSwitch touchSwitch) {
        this.touchSwitch = touchSwitch;
    }
}
