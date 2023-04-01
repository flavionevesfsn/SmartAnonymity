package br.com.ontoiot.classes.dinamyclasses;

import org.apache.jena.rdf.model.Resource;

public class Sensors {
    private String name;
    private Resource resource;
    private Resource equivalentClass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
}
