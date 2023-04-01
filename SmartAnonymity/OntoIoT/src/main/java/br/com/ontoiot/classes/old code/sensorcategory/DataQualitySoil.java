package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.Lysimeter;
import br.com.ontoiot.classes.sensors.UnattendedGround;

public class DataQualitySoil {

    private Lysimeter lysimeter;
    private UnattendedGround unattendedGround;


    public Lysimeter getLysimeter() {
        return lysimeter;
    }

    public void setLysimeter(Lysimeter lysimeter) {
        this.lysimeter = lysimeter;
    }

    public UnattendedGround getUnattendedGround() {
        return unattendedGround;
    }

    public void setUnattendedGround(UnattendedGround unattendedGround) {
        this.unattendedGround = unattendedGround;
    }
}
