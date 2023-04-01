package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.Bio;
import br.com.ontoiot.classes.sensors.Biochip;
import br.com.ontoiot.classes.sensors.Nano;

public class DataAnimalHealth {

    private Biochip biochip;
    private Bio bio;
    private Nano nano;


    public Biochip getbiochip() {
        return biochip;
    }

    public void setbiochip(Biochip biochip) {
        this.biochip = biochip;
    }

    public Bio getBio() {
        return bio;
    }

    public void setBio(Bio bio) {
        this.bio = bio;
    }

    public Nano getNano() {
        return nano;
    }

    public void setNano(Nano nano) {
        this.nano = nano;
    }
}
