package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.BlindSpotMonitor;
import br.com.ontoiot.classes.sensors.BrakeFluidPressure;
import br.com.ontoiot.classes.sensors.FreeFall;

public class DataTrafficCongestion {

    private BlindSpotMonitor blindSpotMonitor;
    private BrakeFluidPressure brakeFluidPressure;
    private FreeFall freeFall;


    public BlindSpotMonitor getBlindSpotMonitor() {
        return blindSpotMonitor;
    }

    public void setBlindSpotMonitor(BlindSpotMonitor blindSpotMonitor) {
        this.blindSpotMonitor = blindSpotMonitor;
    }

    public BrakeFluidPressure getBrakeFluidPressure() {
        return brakeFluidPressure;
    }

    public void setBrakeFluidPressure(BrakeFluidPressure brakeFluidPressure) {
        this.brakeFluidPressure = brakeFluidPressure;
    }

    public FreeFall getFreeFall() {
        return freeFall;
    }

    public void setFreeFall(FreeFall freeFall) {
        this.freeFall = freeFall;
    }
}
