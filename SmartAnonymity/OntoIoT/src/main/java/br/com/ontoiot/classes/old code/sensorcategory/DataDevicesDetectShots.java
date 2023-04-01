package br.com.ontoiot.classes.sensorcategory;

import br.com.ontoiot.classes.sensors.Alarm;
import br.com.ontoiot.classes.sensors.Microphone;
import br.com.ontoiot.classes.sensors.SoundLocator;

public class DataDevicesDetectShots {

    private Alarm alarm;
    private Microphone microphone;
    private SoundLocator soundLocator;


    public Alarm getAlarm() {
        return alarm;
    }

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    public Microphone getMicrophone() {
        return microphone;
    }

    public void setMicrophone(Microphone microphone) {
        this.microphone = microphone;
    }

    public SoundLocator getSoundLocator() {
        return soundLocator;
    }

    public void setSoundLocator(SoundLocator soundLocator) {
        this.soundLocator = soundLocator;
    }
}
