package br.com.ontoiot.classes.dinamyclasses;

import org.apache.jena.rdf.model.Resource;

import java.util.ArrayList;

public class SubDomains {
    private String name;
    private String resourceName;
    private ArrayList<Resource> sensorCategory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Resource> getSensorCategory() {
        return sensorCategory;
    }

    public void setSensorCategory(ArrayList<Resource> sensorCategory) {
        this.sensorCategory = sensorCategory;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    @Override
    public String toString() {
        return "Subdomains{" +
                "name='" + name + '\'' +
                ", sensorCategory=" + sensorCategory +
                '}';
    }
}
