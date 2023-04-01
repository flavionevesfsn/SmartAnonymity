package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.*;

public class DataVehicleStops {

    private Abs abs;
    private AnprWhereVehiclesAreTimedOverFixedDistance AnprWhereVehiclesAreTimedOverFixedDistance;
    private Accelerometer accelerometer;
    private AutomaticTransmissionSpeed automaticTransmissionSpeed;
    private PiezoElectricAccelerometer piezoElectricAccelerometer;


    public Abs getAbs() {
        return abs;
    }

    public void setAbs(Abs abs) {
        this.abs = abs;
    }

    public AnprWhereVehiclesAreTimedOverFixedDistance getAnprWhereVehiclesAreTimedOverFixedDistance() {
        return AnprWhereVehiclesAreTimedOverFixedDistance;
    }

    public void setAnprWhereVehiclesAreTimedOverFixedDistance(AnprWhereVehiclesAreTimedOverFixedDistance AnprWhereVehiclesAreTimedOverFixedDistance) {
        this.AnprWhereVehiclesAreTimedOverFixedDistance = AnprWhereVehiclesAreTimedOverFixedDistance;
    }

    public Accelerometer getAccelerometer() {
        return accelerometer;
    }

    public void setAccelerometer(Accelerometer accelerometer) {
        this.accelerometer = accelerometer;
    }

    public AutomaticTransmissionSpeed getAutomaticTransmissionSpeed() {
        return automaticTransmissionSpeed;
    }

    public void setAutomaticTransmissionSpeed(AutomaticTransmissionSpeed automaticTransmissionSpeed) {
        this.automaticTransmissionSpeed = automaticTransmissionSpeed;
    }

    public PiezoElectricAccelerometer getPiezoElectricAccelerometer() {
        return piezoElectricAccelerometer;
    }

    public void setPiezoElectricAccelerometer(PiezoElectricAccelerometer piezoElectricAccelerometer) {
        this.piezoElectricAccelerometer = piezoElectricAccelerometer;
    }
}
