package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.Abs;
import br.com.ontoiot.classes.sensors.AnprWhereVehiclesAreTimedOverFixedDistance;

public class DataCommunicationVehicleInfrastructure {

    private Abs abs;
    private AnprWhereVehiclesAreTimedOverFixedDistance AnprWhereVehiclesAreTimedOverFixedDistance;


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
}
