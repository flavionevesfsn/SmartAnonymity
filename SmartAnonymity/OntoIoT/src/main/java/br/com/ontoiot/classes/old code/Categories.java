package br.com.ontoiot.classes;

import java.util.ArrayList;

public class Categories {
    private String name;
    private ArrayList<String> sensors;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getSensors() {
        return sensors;
    }

    public void setSensors(ArrayList<String> sensors) {
        this.sensors = sensors;
    }

    public ArrayList<String> getSensorCategories() {
        return sensors;
    }

    public void setSensorCategories(ArrayList<String> sensorCategories) {
        this.sensors = sensorCategories;
    }
}
