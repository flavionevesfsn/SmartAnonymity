package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.*;

public class DataRealTimeLocation {

    private Accelerometer accelerometer;
    private GroundSpeedRadar groundSpeedRadar;
    private PiezoElectricAccelerometer piezoElectricAccelerometer;
    private Position position;
    private UltraWideBandRadar ultraWideBandRadar;


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

    public PiezoElectricAccelerometer getPiezoElectricAccelerometer() {
        return piezoElectricAccelerometer;
    }

    public void setPiezoElectricAccelerometer(PiezoElectricAccelerometer piezoElectricAccelerometer) {
        this.piezoElectricAccelerometer = piezoElectricAccelerometer;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public UltraWideBandRadar getUltraWideBandRadar() {
        return ultraWideBandRadar;
    }

    public void setUltraWideBandRadar(UltraWideBandRadar ultraWideBandRadar) {
        this.ultraWideBandRadar = ultraWideBandRadar;
    }
}
