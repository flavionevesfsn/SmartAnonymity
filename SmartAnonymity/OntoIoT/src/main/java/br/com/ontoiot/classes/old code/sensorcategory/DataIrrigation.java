package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.Nano;
import br.com.ontoiot.classes.sensors.WaterMeter;

public class DataIrrigation {

    private Nano nano;
    private WaterMeter waterMeter;


    public Nano getNano() {
        return nano;
    }

    public void setNano(Nano nano) {
        this.nano = nano;
    }

    public WaterMeter getWaterMeter() {
        return waterMeter;
    }

    public void setWaterMeter(WaterMeter waterMeter) {
        this.waterMeter = waterMeter;
    }
}
