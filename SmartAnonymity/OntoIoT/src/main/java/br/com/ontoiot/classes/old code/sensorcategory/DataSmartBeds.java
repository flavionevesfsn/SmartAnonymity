package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.*;

public class DataSmartBeds {

    private Cmos cmos;
    private MotionDetector motionDetector;
    private Nano nano;
    private OmnidirectionalCamera omnidirectionalCamera;
    private RangeImaging rangeImaging;
    private TimeOfFlightCamera timeOfFlightCamera;
    private Video video;


    public Cmos getCmos() {
        return cmos;
    }

    public void setCmos(Cmos cmos) {
        this.cmos = cmos;
    }

    public MotionDetector getMotionDetector() {
        return motionDetector;
    }

    public void setMotionDetector(MotionDetector motionDetector) {
        this.motionDetector = motionDetector;
    }

    public Nano getNano() {
        return nano;
    }

    public void setNano(Nano nano) {
        this.nano = nano;
    }

    public OmnidirectionalCamera getOmnidirectionalCamera() {
        return omnidirectionalCamera;
    }

    public void setOmnidirectionalCamera(OmnidirectionalCamera omnidirectionalCamera) {
        this.omnidirectionalCamera = omnidirectionalCamera;
    }

    public RangeImaging getRangeImaging() {
        return rangeImaging;
    }

    public void setRangeImaging(RangeImaging rangeImaging) {
        this.rangeImaging = rangeImaging;
    }

    public TimeOfFlightCamera getTimeOfFlightCamera() {
        return timeOfFlightCamera;
    }

    public void setTimeOfFlightCamera(TimeOfFlightCamera timeOfFlightCamera) {
        this.timeOfFlightCamera = timeOfFlightCamera;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
}
