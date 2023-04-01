package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.ElectroOptical;
import br.com.ontoiot.classes.sensors.LedAsLight;

public class DataUseLights {

    private ElectroOptical electroOptical;
    private LedAsLight ledAsLight;

    public LedAsLight getLedAsLight() {
        return ledAsLight;
    }

    public void setLedAsLight(LedAsLight ledAsLight) {
        this.ledAsLight = ledAsLight;
    }


    public ElectroOptical getElectroOptical() {
        return electroOptical;
    }

    public void setElectroOptical(ElectroOptical electroOptical) {
        this.electroOptical = electroOptical;
    }
}
