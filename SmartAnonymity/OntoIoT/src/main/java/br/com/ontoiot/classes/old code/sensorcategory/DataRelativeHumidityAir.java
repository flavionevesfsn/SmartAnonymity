package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.Humistor;
import br.com.ontoiot.classes.sensors.Hydrometer;
import br.com.ontoiot.classes.sensors.Psychrometer;

public class DataRelativeHumidityAir {

    private Humistor humistor;
    private Hydrometer hydrometer;
    private Psychrometer psychrometer;


    public Humistor getHumistor() {
        return humistor;
    }

    public void setHumistor(Humistor humistor) {
        this.humistor = humistor;
    }

    public Hydrometer getHydrometer() {
        return hydrometer;
    }

    public void setHydrometer(Hydrometer hydrometer) {
        this.hydrometer = hydrometer;
    }

    public Psychrometer getPsychrometer() {
        return psychrometer;
    }

    public void setPsychrometer(Psychrometer psychrometer) {
        this.psychrometer = psychrometer;
    }
}
