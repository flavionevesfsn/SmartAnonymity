package br.com.ontoiot.classes.dinamyclasses;

import br.com.ontoiot.OntoIot;
import br.com.ontoiot.OntoIotUtil;
import org.apache.jena.rdf.model.*;

import java.util.ArrayList;

public class OntoIoTStructure {
    private ArrayList<SubDomains> subDomains;
    private ArrayList<Categories> categories;
    private ArrayList<Sensors> sensors;

    public ArrayList<SubDomains> getSubDomains() {
        return subDomains;
    }

    public void setSubDomains(ArrayList<SubDomains> subDomains) {
        this.subDomains = subDomains;
    }

    public ArrayList<Categories> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Categories> categories) {
        this.categories = categories;
    }

    public ArrayList<Sensors> getSensors() {
        return sensors;
    }

    public void setSensors(ArrayList<Sensors> sensors) {
        this.sensors = sensors;
    }

    /**
     * Method in implementation.
     */
    public OntoIoTStructure inferOntologyNoInput() {
        OntoIot ontoIot = new OntoIot();
        InfModel model = ontoIot.createOntology();
        ontoIot.loadOntology(model, OntoIotUtil.OWLISD);

        ArrayList<Resource> subDomains = new ArrayList<>();
        ArrayList<Resource> sensorCategory = new ArrayList<>();
        ArrayList<SubDomains> subSubdomains = new ArrayList<>();
        ArrayList<Categories> categories = new ArrayList<>();
        ArrayList<Sensors> sensors = new ArrayList<>();
        OntoIoTStructure ontoIoTStructure = new OntoIoTStructure();
        ontoIoTStructure.setSensors(sensors);

        Property property = model.getProperty(OntoIotUtil.RDFSNS + "subClassOf");
        Resource r = model.getProperty(OntoIotUtil.NS + "SubDominiosIoT");
        StmtIterator it = model.listStatements(null, property, r);

        // Loading the subdomains
        while (it.hasNext()) {
            Statement stmt = it.nextStatement();
            if (!stmt.getSubject().toString().equals("http://www.w3.org/2002/07/owl#Nothing"))
                subDomains.add(stmt.getSubject());
        }

        // Loading the sensorCategories
        Property eqClass = model.getProperty("http://www.w3.org/2002/07/owl#someValuesFrom");
        it = model.listStatements(null, eqClass, (RDFNode) null);
        while (it.hasNext()) {
            Statement stmt = it.nextStatement();
            sensorCategory.add(stmt.getSubject());
        }

        for (Resource sc : sensorCategory) {
            Property property2 = model.getProperty("http://www.w3.org/2002/07/owl#someValuesFrom");
            Categories a = new Categories();
            a.setResource(model.getResource(model.getProperty(sc, property2).getObject().toString()));
            a.setName(model.getProperty(sc, property2).getObject().toString().replace(OntoIotUtil.NS, ""));
            a.setEquivalentClass(model.getResource(sc.toString()));
            categories.add(a);
        }

        for (Resource sd : subDomains) {
            SubDomains sb = new SubDomains();
            ArrayList<Resource> rs = new ArrayList<>();
            sb.setResourceName(sd.toString());
            sb.setName(sd.toString().replace(OntoIotUtil.NS, ""));

            for (Resource sc : sensorCategory) {
                Property property1 = model.getProperty("http://www.w3.org/2000/01/rdf-schema#subClassOf");
                Property property2 = model.getProperty("http://www.w3.org/2002/07/owl#someValuesFrom");
                if (model.listStatements(sc, property1, sd).toList().size() == 1) {
                    rs.add((Resource) model.getProperty(sc, property2).getObject());
                }
            }


            sb.setSensorCategory(rs);
            subSubdomains.add(sb);
        }

        ontoIoTStructure.setSubDomains(subSubdomains);
        ontoIoTStructure.setCategories(categories);

        return ontoIoTStructure;
    }

    /**
     * Method in implementation.
     */
    public void inferOntologyNoInput2(OntoIoTStructure ontoIoTStructure) {
        OntoIot ontoIot = new OntoIot();
        InfModel model = ontoIot.createOntology();
        ontoIot.loadOntology(model, OntoIotUtil.OWLSC);

        Property property = model.getProperty("http://www.w3.org/2002/07/owl#someValuesFrom");
        StmtIterator it = model.listStatements(null, property, (RDFNode) null);

        while (it.hasNext()) {
            Statement stmt = it.nextStatement();
            Sensors s = new Sensors();
            s.setName(stmt.getObject().toString().replace(OntoIotUtil.NS, ""));
            s.setResource(model.getResource(stmt.getObject().toString()));
            s.setEquivalentClass(stmt.getSubject());
            ontoIoTStructure.getSensors().add(s);
        }

        for (Categories c : ontoIoTStructure.getCategories()) {
            ArrayList<Sensors> sa = new ArrayList<>();

            for (Sensors s : ontoIoTStructure.getSensors()) {
                Property property2 = model.getProperty("http://www.w3.org/2000/01/rdf-schema#subClassOf");
                StmtIterator bb = s.getEquivalentClass().listProperties(property2);

                while (bb.hasNext()) {
                    Statement stmt = bb.nextStatement();
                    if (stmt.getObject().toString().equals(c.getResource())) {
                        sa.add(s);
                    }
                }
            }

            c.setSensors(sa);
        }
    }

    /**
     * Method in implementation.
     */
    public void dynamicLoadClasses() {
        OntoIoTStructure ontoIoTStructure = inferOntologyNoInput();
        inferOntologyNoInput2(ontoIoTStructure);

        OntoIot ontoIot = new OntoIot();
        ArrayList<String> sensors = ontoIot.loadOntologyClassesPerPackage("br.com.ontoiot.classes.subdomains", "complete");

        for (SubDomains s : ontoIoTStructure.getSubDomains()) {
            if (!sensors.contains(s.getName())) {
                System.out.println(s.getName());
            }
        }
    }

}
