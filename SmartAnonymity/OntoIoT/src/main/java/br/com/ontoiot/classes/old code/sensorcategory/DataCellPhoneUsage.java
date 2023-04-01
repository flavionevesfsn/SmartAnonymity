package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.*;

public class DataCellPhoneUsage {

    private Accelerometer accelerometer;
    private Cmos cmos;
    private Capacitance capacitance;
    private ElectroOptical electroOptical;
    private Gyroscope gyroscope;
    private Gyroscopic gyroscopic;
    private PiezoElectricAccelerometer piezoElectricAccelerometer;
    private PiezoElectric piezoElectric;


    public Accelerometer getAccelerometer() {
        return accelerometer;
    }

    public void setAccelerometer(Accelerometer accelerometer) {
        this.accelerometer = accelerometer;
    }

    public Cmos getCmos() {
        return cmos;
    }

    public void setCmos(Cmos cmos) {
        this.cmos = cmos;
    }

    public Capacitance getCapacitance() {
        return capacitance;
    }

    public void setCapacitance(Capacitance capacitance) {
        this.capacitance = capacitance;
    }

    public ElectroOptical getElectroOptical() {
        return electroOptical;
    }

    public void setElectroOptical(ElectroOptical electroOptical) {
        this.electroOptical = electroOptical;
    }

    public Gyroscope getGyroscope() {
        return gyroscope;
    }

    public void setGyroscope(Gyroscope gyroscope) {
        this.gyroscope = gyroscope;
    }

    public Gyroscopic getGyroscopic() {
        return gyroscopic;
    }

    public void setGyroscopic(Gyroscopic gyroscopic) {
        this.gyroscopic = gyroscopic;
    }

    public PiezoElectricAccelerometer getPiezoElectricAccelerometer() {
        return piezoElectricAccelerometer;
    }

    public void setPiezoElectricAccelerometer(PiezoElectricAccelerometer piezoElectricAccelerometer) {
        this.piezoElectricAccelerometer = piezoElectricAccelerometer;
    }

    public PiezoElectric getPiezoElectric() {
        return piezoElectric;
    }

    public void setPiezoElectric(PiezoElectric piezoElectric) {
        this.piezoElectric = piezoElectric;
    }
}
