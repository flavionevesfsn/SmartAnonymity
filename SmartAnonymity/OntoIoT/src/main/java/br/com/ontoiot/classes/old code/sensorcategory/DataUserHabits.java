package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.Actigraphy;
import br.com.ontoiot.classes.sensors.PassiveInfrared;

public class DataUserHabits {

    private Actigraphy actigraphy;
    private PassiveInfrared passiveInfrared;


    public Actigraphy getActigraphy() {
        return actigraphy;
    }

    public void setActigraphy(Actigraphy actigraphy) {
        this.actigraphy = actigraphy;
    }

    public PassiveInfrared getPassiveInfrared() {
        return passiveInfrared;
    }

    public void setPassiveInfrared(PassiveInfrared passiveInfrared) {
        this.passiveInfrared = passiveInfrared;
    }
}
