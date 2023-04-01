package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.BlindSpotMonitor;
import br.com.ontoiot.classes.sensors.Parking;

public class DataParkingAvailableSpaces {

    private BlindSpotMonitor blindSpotMonitor;
    private Parking parking;


    public BlindSpotMonitor getBlindSpotMonitor() {
        return blindSpotMonitor;
    }

    public void setBlindSpotMonitor(BlindSpotMonitor blindSpotMonitor) {
        this.blindSpotMonitor = blindSpotMonitor;
    }

    public Parking getParking() {
        return parking;
    }

    public void setParking(Parking parking) {
        this.parking = parking;
    }
}
