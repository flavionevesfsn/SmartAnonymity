package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.*;

public class DataVehicleLocation {

    private AnprWhereVehiclesAreTimedOverFixedDistance AnprWhereVehiclesAreTimedOverFixedDistance;
    private Accelerometer accelerometer;
    private CapacitiveDisplacement capacitiveDisplacement;
    private ChargeCoupledDevice chargeCoupledDevice;
    private DisplacementReceiver displacementReceiver;
    private GroundSpeedRadar groundSpeedRadar;
    private PiezoElectricAccelerometer piezoElectricAccelerometer;
    private Position position;
    private Radar radar;
    private UltraWideBandRadar ultraWideBandRadar;


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

    public CapacitiveDisplacement getCapacitiveDisplacement() {
        return capacitiveDisplacement;
    }

    public void setCapacitiveDisplacement(CapacitiveDisplacement capacitiveDisplacement) {
        this.capacitiveDisplacement = capacitiveDisplacement;
    }

    public ChargeCoupledDevice getChargeCoupledDevice() {
        return chargeCoupledDevice;
    }

    public void setChargeCoupledDevice(ChargeCoupledDevice chargeCoupledDevice) {
        this.chargeCoupledDevice = chargeCoupledDevice;
    }

    public DisplacementReceiver getDisplacementReceiver() {
        return displacementReceiver;
    }

    public void setDisplacementReceiver(DisplacementReceiver displacementReceiver) {
        this.displacementReceiver = displacementReceiver;
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

    public Radar getRadar() {
        return radar;
    }

    public void setRadar(Radar radar) {
        this.radar = radar;
    }

    public UltraWideBandRadar getUltraWideBandRadar() {
        return ultraWideBandRadar;
    }

    public void setUltraWideBandRadar(UltraWideBandRadar ultraWideBandRadar) {
        this.ultraWideBandRadar = ultraWideBandRadar;
    }
}
