package br.com.ontoiot.classes.dinamyclasses;

import org.apache.jena.rdf.model.Resource;

import java.util.ArrayList;

public class Categories {
    private String name;
    private Resource resource;
    private Resource equivalentClass;
    private ArrayList<Sensors> sensors;

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public Resource getEquivalentClass() {
        return equivalentClass;
    }

    public void setEquivalentClass(Resource equivalentClass) {
        this.equivalentClass = equivalentClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Sensors> getSensors() {
        return sensors;
    }

    public void setSensors(ArrayList<Sensors> sensors) {
        this.sensors = sensors;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "name='" + name + '\'' +
                ", resource='" + resource + '\'' +
                ", equivalentClass='" + equivalentClass + '\'' +
                ", sensors=" + sensors +
                '}';
    }
}
