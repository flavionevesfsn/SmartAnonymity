package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.*;

public class DataVehicleFuelConsumption {

    private Afr afr;
    private AirFlowMeter airFlowMeter;
    private AirFuelRatioMeter airFuelRatioMeter;
    private FuelLevel fuelLevel;
    private FuelPressure fuelPressure;
    private Level level;
    private MagneticLevelGauge magneticLevelGauge;
    private OilLevel oilLevel;
    private Ultrasonic ultrasonic;


    public Afr getAfr() {
        return afr;
    }

    public void setAfr(Afr afr) {
        this.afr = afr;
    }

    public AirFlowMeter getAirFlowMeter() {
        return airFlowMeter;
    }

    public void setAirFlowMeter(AirFlowMeter airFlowMeter) {
        this.airFlowMeter = airFlowMeter;
    }

    public AirFuelRatioMeter getAirFuelRatioMeter() {
        return airFuelRatioMeter;
    }

    public void setAirFuelRatioMeter(AirFuelRatioMeter airFuelRatioMeter) {
        this.airFuelRatioMeter = airFuelRatioMeter;
    }

    public FuelLevel getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(FuelLevel fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public FuelPressure getFuelPressure() {
        return fuelPressure;
    }

    public void setFuelPressure(FuelPressure fuelPressure) {
        this.fuelPressure = fuelPressure;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public MagneticLevelGauge getMagneticLevelGauge() {
        return magneticLevelGauge;
    }

    public void setMagneticLevelGauge(MagneticLevelGauge magneticLevelGauge) {
        this.magneticLevelGauge = magneticLevelGauge;
    }

    public OilLevel getOilLevel() {
        return oilLevel;
    }

    public void setOilLevel(OilLevel oilLevel) {
        this.oilLevel = oilLevel;
    }

    public Ultrasonic getUltrasonic() {
        return ultrasonic;
    }

    public void setUltrasonic(Ultrasonic ultrasonic) {
        this.ultrasonic = ultrasonic;
    }
}
