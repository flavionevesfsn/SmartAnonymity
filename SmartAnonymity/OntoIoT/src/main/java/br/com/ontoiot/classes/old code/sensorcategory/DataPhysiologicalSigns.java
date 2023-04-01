package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.*;

public class DataPhysiologicalSigns {

    private Actigraphy actigraphy;
    private Bio bio;
    private Biochip biochip;
    private Breathalyzer breathalyzer;
    private DiffusionTensorImaging diffusionTensorImaging;
    private FunctionalMagneticResonanceImaging functionalMagneticResonanceImaging;
    private Heartbeat heartbeat;
    private MagneticResonanceImaging magneticResonanceImaging;
    private NanoTetherball nanoTetherball;
    private Nano nano;


    public Actigraphy getActigraphy() {
        return actigraphy;
    }

    public void setActigraphy(Actigraphy actigraphy) {
        this.actigraphy = actigraphy;
    }

    public Bio getBio() {
        return bio;
    }

    public void setBio(Bio bio) {
        this.bio = bio;
    }

    public Biochip getBiochip() {
        return biochip;
    }

    public void setBiochip(Biochip biochip) {
        this.biochip = biochip;
    }

    public Breathalyzer getBreathalyzer() {
        return breathalyzer;
    }

    public void setBreathalyzer(Breathalyzer breathalyzer) {
        this.breathalyzer = breathalyzer;
    }

    public DiffusionTensorImaging getDiffusionTensorImaging() {
        return diffusionTensorImaging;
    }

    public void setDiffusionTensorImaging(DiffusionTensorImaging diffusionTensorImaging) {
        this.diffusionTensorImaging = diffusionTensorImaging;
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

    public MagneticResonanceImaging getMagneticResonanceImaging() {
        return magneticResonanceImaging;
    }

    public void setMagneticResonanceImaging(MagneticResonanceImaging magneticResonanceImaging) {
        this.magneticResonanceImaging = magneticResonanceImaging;
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
