package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.*;

public class DataSecurityCameras {

    private ActivePixel activePixel;
    private AnalogImageProcessing analogImageProcessing;
    private AngleSensitivePixel angleSensitivePixel;
    private BackIlluminated backIlluminated;
    private Cmos cmos;
    private Catadioptric catadioptric;
    private Colorimeter colorimeter;
    private Microbolometer microbolometer;
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

    public AnalogImageProcessing getAnalogImageProcessing() {
        return analogImageProcessing;
    }

    public void setAnalogImageProcessing(AnalogImageProcessing analogImageProcessing) {
        this.analogImageProcessing = analogImageProcessing;
    }

    public AngleSensitivePixel getAngleSensitivePixel() {
        return angleSensitivePixel;
    }

    public void setAngleSensitivePixel(AngleSensitivePixel angleSensitivePixel) {
        this.angleSensitivePixel = angleSensitivePixel;
    }

    public BackIlluminated getBackIlluminated() {
        return backIlluminated;
    }

    public void setBackIlluminated(BackIlluminated backIlluminated) {
        this.backIlluminated = backIlluminated;
    }

    public Cmos getCmos() {
        return cmos;
    }

    public void setCmos(Cmos cmos) {
        this.cmos = cmos;
    }

    public Catadioptric getCatadioptric() {
        return catadioptric;
    }

    public void setCatadioptric(Catadioptric catadioptric) {
        this.catadioptric = catadioptric;
    }

    public Colorimeter getColorimeter() {
        return colorimeter;
    }

    public void setColorimeter(Colorimeter colorimeter) {
        this.colorimeter = colorimeter;
    }

    public Microbolometer getMicrobolometer() {
        return microbolometer;
    }

    public void setMicrobolometer(Microbolometer microbolometer) {
        this.microbolometer = microbolometer;
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
