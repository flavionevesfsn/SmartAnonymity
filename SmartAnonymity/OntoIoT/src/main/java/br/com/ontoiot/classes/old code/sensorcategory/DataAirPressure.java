package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.*;

public class DataAirPressure {

    private AirFlowMeter airFlowMeter;
    private Barograph barograph;
    private Barometer barometer;
    private BoostGauge boostGauge;
    private PressureGauge pressureGauge;
    private Pressure pressure;
    private TimePressureGauge timePressureGauge;


    public AirFlowMeter getAirFlowMater() {
        return airFlowMeter;
    }

    public void setAirFlowMater(AirFlowMeter airFlowMeter) {
        this.airFlowMeter = airFlowMeter;
    }

    public Barograph getBarograph() {
        return barograph;
    }

    public void setBarograph(Barograph barograph) {
        this.barograph = barograph;
    }

    public Barometer getBarometer() {
        return barometer;
    }

    public void setBarometer(Barometer barometer) {
        this.barometer = barometer;
    }

    public BoostGauge getBoostGauge() {
        return boostGauge;
    }

    public void setBoostGauge(BoostGauge boostGauge) {
        this.boostGauge = boostGauge;
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

    public TimePressureGauge getTimePressureGauge() {
        return timePressureGauge;
    }

    public void setTimePressureGauge(TimePressureGauge timePressureGauge) {
        this.timePressureGauge = timePressureGauge;
    }
}
