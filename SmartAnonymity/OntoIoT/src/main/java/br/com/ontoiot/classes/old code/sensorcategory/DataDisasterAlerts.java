package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.Alarm;
import br.com.ontoiot.classes.sensors.GasDetector;
import br.com.ontoiot.classes.sensors.Thermocouple;

public class DataDisasterAlerts {
    private Alarm alarm;
    private GasDetector gasDetector;
    private Thermocouple thermocouple;


    public Alarm getAlarm() {
        return alarm;
    }

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    public GasDetector getGasDetector() {
        return gasDetector;
    }

    public void setGasDetector(GasDetector gasDetector) {
        this.gasDetector = gasDetector;
    }

    public Thermocouple getthermocouple() {
        return thermocouple;
    }

    public void setthermocouple(Thermocouple thermocouple) {
        this.thermocouple = thermocouple;
    }
}
