package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.LaserSurfaceVelocimeter;
import br.com.ontoiot.classes.sensors.LaserSurfaceVelocimetersForMovingSurfaces;
import br.com.ontoiot.classes.sensors.PiezoElectricAccelerometer;
import br.com.ontoiot.classes.sensors.ShockDetector;

public class DataIndustrialProduction {

    private LaserSurfaceVelocimeter laserSurfaceVelocimeter;
    private LaserSurfaceVelocimetersForMovingSurfaces laserSurfaceVelocimetersForMovingSurfaces;
    private PiezoElectricAccelerometer piezoElectricAccelerometer;
    private ShockDetector shockDetector;


    public LaserSurfaceVelocimeter getLaserSurfaceVelocimeter() {
        return laserSurfaceVelocimeter;
    }

    public void setLaserSurfaceVelocimeter(LaserSurfaceVelocimeter laserSurfaceVelocimeter) {
        this.laserSurfaceVelocimeter = laserSurfaceVelocimeter;
    }

    public LaserSurfaceVelocimetersForMovingSurfaces getLaserSurfaceVelocimetersForMovingSurfaces() {
        return laserSurfaceVelocimetersForMovingSurfaces;
    }

    public void setLaserSurfaceVelocimetersForMovingSurfaces(LaserSurfaceVelocimetersForMovingSurfaces laserSurfaceVelocimetersForMovingSurfaces) {
        this.laserSurfaceVelocimetersForMovingSurfaces = laserSurfaceVelocimetersForMovingSurfaces;
    }

    public PiezoElectricAccelerometer getPiezoElectricAccelerometer() {
        return piezoElectricAccelerometer;
    }

    public void setPiezoElectricAccelerometer(PiezoElectricAccelerometer piezoElectricAccelerometer) {
        this.piezoElectricAccelerometer = piezoElectricAccelerometer;
    }

    public ShockDetector getShockDetector() {
        return shockDetector;
    }

    public void setShockDetector(ShockDetector shockDetector) {
        this.shockDetector = shockDetector;
    }
}
