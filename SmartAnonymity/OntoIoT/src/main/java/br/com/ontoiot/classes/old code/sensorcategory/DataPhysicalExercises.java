package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.*;

public class DataPhysicalExercises {

    private Accelerometer accelerometer;
    private GroundSpeedRadar groundSpeedRadar;
    private Heartbeat heartbeat;
    private Nano nano;
    private PiezoElectricAccelerometer piezoElectricAccelerometer;


    public Accelerometer getAccelerometer() {
        return accelerometer;
    }

    public void setAccelerometer(Accelerometer accelerometer) {
        this.accelerometer = accelerometer;
    }

    public GroundSpeedRadar getGroundSpeedRadar() {
        return groundSpeedRadar;
    }

    public void setGroundSpeedRadar(GroundSpeedRadar groundSpeedRadar) {
        this.groundSpeedRadar = groundSpeedRadar;
    }

    public Heartbeat getHeartbeat() {
        return heartbeat;
    }

    public void setHeartbeat(Heartbeat heartbeat) {
        this.heartbeat = heartbeat;
    }

    public Nano getNano() {
        return nano;
    }

    public void setNano(Nano nano) {
        this.nano = nano;
    }

    public PiezoElectricAccelerometer getPiezoElectricAccelerometer() {
        return piezoElectricAccelerometer;
    }

    public void setPiezoElectricAccelerometer(PiezoElectricAccelerometer piezoElectricAccelerometer) {
        this.piezoElectricAccelerometer = piezoElectricAccelerometer;
    }
}
