package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.HeatFlux;
import br.com.ontoiot.classes.sensors.InfraredThermometer;
import br.com.ontoiot.classes.sensors.TemperatureGauge;
import br.com.ontoiot.classes.sensors.Thermometer;

public class DataThermostatsUse {

    private HeatFlux heatFlux;
    private InfraredThermometer InfraredThermometer;
    private TemperatureGauge temperatureGauge;
    private Thermometer thermometer;


    public HeatFlux getHeatFlux() {
        return heatFlux;
    }

    public void setHeatFlux(HeatFlux heatFlux) {
        this.heatFlux = heatFlux;
    }

    public InfraredThermometer getInfraredThermometer() {
        return InfraredThermometer;
    }

    public void setInfraredThermometer(InfraredThermometer InfraredThermometer) {
        this.InfraredThermometer = InfraredThermometer;
    }

    public TemperatureGauge getTemperatureGauge() {
        return temperatureGauge;
    }

    public void setTemperatureGauge(TemperatureGauge temperatureGauge) {
        this.temperatureGauge = temperatureGauge;
    }

    public Thermometer getThermometer() {
        return thermometer;
    }

    public void setThermometer(Thermometer thermometer) {
        this.thermometer = thermometer;
    }
}
