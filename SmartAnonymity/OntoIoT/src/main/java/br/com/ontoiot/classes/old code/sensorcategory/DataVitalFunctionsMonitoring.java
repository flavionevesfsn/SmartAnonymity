package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.*;

public class DataVitalFunctionsMonitoring {

    private Actigraphy actigraphy;
    private Biochip biochip;
    private Bio bio;
    private FunctionalMagneticResonanceImaging functionalMagneticResonanceImaging;
    private Heartbeat heartbeat;
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

    public FunctionalMagneticResonanceImaging getFunctionalMagneticResonanceImaging() {
        return functionalMagneticResonanceImaging;
    }

    public void setFunctionalMagneticResonanceImaging(FunctionalMagneticResonanceImaging functionalMagneticResonanceImaging) {
        this.functionalMagneticResonanceImaging = functionalMagneticResonanceImaging;
    }

    public Heartbeat getHeartbeat() {
        return heartbeat;
    }

    public void setHeartbeat(Heartbeat heartbeat) {
        this.heartbeat = heartbeat;
    }

    public Nano getNano() {
        return nano;
    }

    public void setNano(Nano nano) {
        this.nano = nano;
    }
}
