package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.AirFlowMeter;
import br.com.ontoiot.classes.sensors.Pressure;
import br.com.ontoiot.classes.sensors.PressureGauge;
import br.com.ontoiot.classes.sensors.TirePressure;

public class DataPressureTiresVehicle {

    private AirFlowMeter airFlowMeter;
    private PressureGauge pressureGauge;
    private Pressure pressure;
    private TirePressure tirePressure;


    public AirFlowMeter getAirFlowMeter() {
        return airFlowMeter;
    }

    public void setAirFlowMeter(AirFlowMeter airFlowMeter) {
        this.airFlowMeter = airFlowMeter;
    }

    public PressureGauge getPressureGauge() {
        return pressureGauge;
    }

    public void setPressureGauge(PressureGauge pressureGauge) {
        this.pressureGauge = pressureGauge;
    }

    public Pressure getPressure() {
        return pressure;
    }

    public void setPressure(Pressure pressure) {
        this.pressure = pressure;
    }

    public TirePressure getTirePressure() {
        return tirePressure;
    }

    public void setTirePressure(TirePressure tirePressure) {
        this.tirePressure = tirePressure;
    }
}
