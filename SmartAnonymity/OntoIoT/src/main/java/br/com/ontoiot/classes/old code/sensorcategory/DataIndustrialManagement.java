package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.ChargeCoupledDevice;
import br.com.ontoiot.classes.sensors.ShockDetector;

public class DataIndustrialManagement {

    private ChargeCoupledDevice chargeCoupledDevice;
    private ShockDetector shockDetector;


    public ChargeCoupledDevice getChargeCoupledDevice() {
        return chargeCoupledDevice;
    }

    public void setChargeCoupledDevice(ChargeCoupledDevice chargeCoupledDevice) {
        this.chargeCoupledDevice = chargeCoupledDevice;
    }

    public ShockDetector getShockDetector() {
        return shockDetector;
    }

    public void setShockDetector(ShockDetector shockDetector) {
        this.shockDetector = shockDetector;
    }
}
