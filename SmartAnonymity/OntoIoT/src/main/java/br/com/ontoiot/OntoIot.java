package br.com.ontoiot;

import com.google.common.collect.ImmutableSet;
import com.google.common.reflect.ClassPath;
import openllet.jena.PelletReasonerFactory;
import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.*;
import org.apache.jena.reasoner.Reasoner;

import java.io.IOException;
import java.util.ArrayList;

public class OntoIot {

    /**
     * Determine subdomains based on categories.
     *
     * @param categoriesInferences List of inferences with the categories of each dataset.
     * @return A list of the subdomains of each dataset.
     */
    public ArrayList<Inferences> inferSubDomain(ArrayList<Inferences> categoriesInferences) {
        OntoIot ontoIot = new OntoIot();
        InfModel model = ontoIot.createOntology();
        ontoIot.loadOntology(model, OntoIotUtil.OWLISD);
        ontoIot.insertInputClasses(model, categoriesInferences);
        ArrayList<String> subdomains = ontoIot.loadOntologyClassesPerPackage("br.com.ontoiot.classes.subdomains", "simple");
        ArrayList<Inferences> subdomainInferences = ontoIot.inferOntology(model, categoriesInferences, "hasSubdomain", subdomains);
        model.close();

        return subdomainInferences;
    }

    /**
     * Determine categories based on sensors.
     *
     * @param sensorsInferences List of inferences with the sensors of each dataset.
     * @return A list of the categories of each dataset.
     */
    public ArrayList<Inferences> inferSensorCategories(ArrayList<Inferences> sensorsInferences) {
        // Creating and loading the SensorCategory Ontology
        OntoIot ontoIot = new OntoIot();
        InfModel model = ontoIot.createOntology();
        ontoIot.loadOntology(model, OntoIotUtil.OWLSC);

        ontoIot.insertInputClasses(model, sensorsInferences);
        ArrayList<String> categories = ontoIot.loadOntologyClassesPerPackage("br.com.ontoiot.classes.sensorcategory", "simple");
        ArrayList<Inferences> categoriesInferences = ontoIot.inferOntology(model, sensorsInferences, "hasSensorCategory", categories);
        model.close();

        return categoriesInferences;
    }


    /**
     * Infer an ontology based on predicate and object.
     *
     * @param ontology  The ontology.
     * @param inputData A list of inferences (sensors or categories)
     * @param predicate A predicate, e.g., hasSensor or hasSensorCategory
     * @return A list of the inferences of each dataset.
     */
    public ArrayList<Inferences> inferOntology(InfModel ontology, ArrayList<Inferences> inputData, String predicate,
                                               ArrayList<String> classes) {

        ArrayList<Inferences> scInferences = new ArrayList<>();

        for (Inferences inference : inputData) {
            Resource resource = ontology.getResource(OntoIotUtil.NS + inference.getSubject()); // Dataset
            Property property = ontology.getProperty(OntoIotUtil.PSUBCLASSOF); //
            StmtIterator it = ontology.listStatements(resource, property, (RDFNode) null);
            ArrayList<String> scObjects = new ArrayList<>();

            while (it.hasNext()) {
                Statement stmt = it.nextStatement();
                String object = stmt.getObject().toString().replace(OntoIotUtil.NS, "");
                String treatedObject = inference.objectExist(object, classes);
                if (!treatedObject.equals("")) scObjects.add(treatedObject);
            }
            scInferences.add(new Inferences(inference.getSubject(), predicate, scObjects));

        }
        return scInferences;
    }

    /**
     * Create an empty ontology.
     *
     * @return An empty ontology.
     */
    public InfModel createOntology() {
        final Reasoner reasoner = PelletReasonerFactory.theInstance().create();
        final Model emptyModel = ModelFactory.createDefaultModel();

        return ModelFactory.createInfModel(reasoner, emptyModel);
    }

    /**
     * Load an ontology.
     */
    public void loadOntology(InfModel model, String file) {
        model.read(file);
        model.prepare();
    }

    /**
     * Insert the ontology input examples.
     *
     * @param ontology   The ontology loaded
     * @param inferences A list of inferences with examples.
     */
    public void insertInputClasses(InfModel ontology, ArrayList<Inferences> inferences) {
        final OntModel modelInput = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM);

        for (Inferences inference : inferences) {
            OntClass er = modelInput.createClass(OntoIotUtil.NS + inference.getSubject());
            Property property = modelInput.createProperty(OntoIotUtil.NS + inference.getPredicate());

            for (String object : inference.getObject()) {
                final Resource ec = modelInput.createResource(OntoIotUtil.NS + object);
                er.addSuperClass(modelInput.createSomeValuesFromRestriction(null, property, ec));
            }
        }
        ontology.add(modelInput);
    }

    /**
     * Load ontology classes defined in Java with their simple or complete names.
     * Simple name ABS
     * complete name: br.com.ontoiot.sensors.abs
     *
     * @param packagePath A package path
     * @param nameType    Type of the name
     * @return Returns a list of class names in a given package.
     */
    public ArrayList<String> loadOntologyClassesPerPackage(String packagePath, String nameType) {
        ArrayList<String> ontologyClasses = new ArrayList<>();

        try {
            ImmutableSet<ClassPath.ClassInfo> packageClasses;
            packageClasses = ClassPath.from(getClass().getClassLoader()).getTopLevelClasses(packagePath);

            for (ClassPath.ClassInfo packageClass : packageClasses) {
                if (nameType.equals("simple")) ontologyClasses.add(packageClass.getSimpleName());
                else if (nameType.equals("complete")) ontologyClasses.add(packageClass.getName());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return ontologyClasses;
    }

}
