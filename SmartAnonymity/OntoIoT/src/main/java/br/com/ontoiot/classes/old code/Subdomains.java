package br.com.ontoiot.classes;

import java.util.ArrayList;

public class Subdomains {
    private String name;
    private ArrayList<String> sensorCategories;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getSensorCategories() {
        return sensorCategories;
    }

    public void setSensorCategories(ArrayList<String> sensorCategories) {
        this.sensorCategories = sensorCategories;
    }
}
