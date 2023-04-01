package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.*;

public class DataMonitoringCamera {

    private ActivePixel activePixel;
    private AngleSensitivePixel angleSensitivePixel;
    private Image image;
    private Microbolometer microbolometer;
    private MotionDetector motionDetector;
    private OmnidirectionalCamera omnidirectionalCamera;
    private RangeImaging rangeImaging;
    private StaringArray staringArray;
    private TimeOfFlightCamera timeOfFlightCamera;
    private Video video;


    public ActivePixel getActivePixel() {
        return activePixel;
    }

    public void setActivePixel(ActivePixel activePixel) {
        this.activePixel = activePixel;
    }

    public AngleSensitivePixel getAngleSensitivePixel() {
        return angleSensitivePixel;
    }

    public void setAngleSensitivePixel(AngleSensitivePixel angleSensitivePixel) {
        this.angleSensitivePixel = angleSensitivePixel;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Microbolometer getMicrobolometer() {
        return microbolometer;
    }

    public void setMicrobolometer(Microbolometer microbolometer) {
        this.microbolometer = microbolometer;
    }

    public MotionDetector getMotionDetector() {
        return motionDetector;
    }

    public void setMotionDetector(MotionDetector motionDetector) {
        this.motionDetector = motionDetector;
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

    public StaringArray getStaringArray() {
        return staringArray;
    }

    public void setStaringArray(StaringArray staringArray) {
        this.staringArray = staringArray;
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
