package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.*;

public class DataConditionElderly {

    private Actigraphy actigraphy;
    private Biochip biochip;
    private Bio bio;
    private HallEffect hallEffect;
    private Heartbeat heartbeat;
    private Hyperspectral hyperspectral;
    private NanoTetherball nanoTetherball;
    private Nano nano;


    public Actigraphy getActigraphy() {
        return actigraphy;
    }

    public void setActigraphy(Actigraphy actigraphy) {
        this.actigraphy = actigraphy;
    }

    public Biochip getBiochip() {
        return biochip;
    }

    public void setBiochip(Biochip biochip) {
        this.biochip = biochip;
    }

    public Bio getBio() {
        return bio;
    }

    public void setBio(Bio bio) {
        this.bio = bio;
    }

    public HallEffect getHallEffect() {
        return hallEffect;
    }

    public void setHallEffect(HallEffect hallEffect) {
        this.hallEffect = hallEffect;
    }

    public Heartbeat getHeartbeat() {
        return heartbeat;
    }

    public void setHeartbeat(Heartbeat heartbeat) {
        this.heartbeat = heartbeat;
    }

    public Hyperspectral getHyperspectral() {
        return hyperspectral;
    }

    public void setHyperspectral(Hyperspectral hyperspectral) {
        this.hyperspectral = hyperspectral;
    }

    public NanoTetherball getNanoTetherball() {
        return nanoTetherball;
    }

    public void setNanoTetherball(NanoTetherball nanoTetherball) {
        this.nanoTetherball = nanoTetherball;
    }

    public Nano getNano() {
        return nano;
    }

    public void setNano(Nano nano) {
        this.nano = nano;
    }
}
