package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.Position;
import br.com.ontoiot.classes.sensors.UltraWideBandRadar;

public class DataHouseLocation {

    private Position position;
    private UltraWideBandRadar ultraWideBandRadar;


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
