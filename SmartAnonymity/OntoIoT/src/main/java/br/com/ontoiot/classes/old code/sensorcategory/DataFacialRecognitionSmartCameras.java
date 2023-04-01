package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.*;

public class DataFacialRecognitionSmartCameras {


    private ActivePixel activePixel;
    private AnalogImageProcessing analogImageProcessing;
    private AngleSensitivePixel angleSensitivePixel;
    private Cmos cmos;
    private Catadioptric catadioptric;
    private Colorimeter colorimeter;
    private Image image;
    private ImageFormat imageFormat;
    private OmnidirectionalCamera omnidirectionalCamera;
    private RangeImaging rangeImaging;
    private StaringArray staringArray;


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

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public ImageFormat getImageFormat() {
        return imageFormat;
    }

    public void setImageFormat(ImageFormat imageFormat) {
        this.imageFormat = imageFormat;
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
}
