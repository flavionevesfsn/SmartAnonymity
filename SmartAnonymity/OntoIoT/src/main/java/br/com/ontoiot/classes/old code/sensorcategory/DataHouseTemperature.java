package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.*;

public class DataHouseTemperature {

    private Calorimeter calorimeter;
    private InfraredThermometer InfraredThermometer;
    private Pyrometer pyrometer;
    private QuartzThermometer quartzThermometer;
    private ResistanceThermometer resistanceThermometer;
    private SiliconBandgapTemperature siliconBandgapTemperature;
    private TemperatureGauge temperatureGauge;
    private Thermocouple thermocouple;
    private Thermometer thermometer;


    public Calorimeter getCalorimeter() {
        return calorimeter;
    }

    public void setCalorimeter(Calorimeter calorimeter) {
        this.calorimeter = calorimeter;
    }

    public InfraredThermometer getInfraredThermometer() {
        return InfraredThermometer;
    }

    public void setInfraredThermometer(InfraredThermometer InfraredThermometer) {
        this.InfraredThermometer = InfraredThermometer;
    }

    public Pyrometer getPyrometer() {
        return pyrometer;
    }

    public void setPyrometer(Pyrometer pyrometer) {
        this.pyrometer = pyrometer;
    }

    public QuartzThermometer getQuartzThermometer() {
        return quartzThermometer;
    }

    public void setQuartzThermometer(QuartzThermometer quartzThermometer) {
        this.quartzThermometer = quartzThermometer;
    }

    public ResistanceThermometer getResistanceThermometer() {
        return resistanceThermometer;
    }

    public void setResistanceThermometer(ResistanceThermometer resistanceThermometer) {
        this.resistanceThermometer = resistanceThermometer;
    }

    public SiliconBandgapTemperature getSiliconBandgapTemperature() {
        return siliconBandgapTemperature;
    }

    public void setSiliconBandgapTemperature(SiliconBandgapTemperature siliconBandgapTemperature) {
        this.siliconBandgapTemperature = siliconBandgapTemperature;
    }

    public TemperatureGauge getTemperatureGauge() {
        return temperatureGauge;
    }

    public void setTemperatureGauge(TemperatureGauge temperatureGauge) {
        this.temperatureGauge = temperatureGauge;
    }

    public Thermocouple getthermocouple() {
        return thermocouple;
    }

    public void setthermocouple(Thermocouple thermocouple) {
        this.thermocouple = thermocouple;
    }

    public Thermometer getThermometer() {
        return thermometer;
    }

    public void setThermometer(Thermometer thermometer) {
        this.thermometer = thermometer;
    }
}
