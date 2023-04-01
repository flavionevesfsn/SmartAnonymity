package br.com.ontoiot;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Stream;

public class Inferences {
    private String subject;
    private String predicate;
    private ArrayList<String> object;
    private String type;
    private String anonymization;
    private Stream<Map.Entry<String, Float>> evaluationOccurrences;
    private Stream<Map.Entry<String, Float>> evaluationCategory;
    private Stream<Map.Entry<String, Float>> evaluationAnonymization;

    public Inferences(String subject, String predicate, ArrayList<String> object) {
        setSubject(subject);
        setPredicate(predicate);
        setObject(object);
    }

    public Inferences() {

    }

    public Stream<Map.Entry<String, Float>> getEvaluationOccurrences() {
        return evaluationOccurrences;
    }

    public void setEvaluationOccurrences(Stream<Map.Entry<String, Float>> evaluationOccurrences) {
        this.evaluationOccurrences = evaluationOccurrences;
    }

    public Stream<Map.Entry<String, Float>> getEvaluationCategory() {
        return evaluationCategory;
    }

    public void setEvaluationCategory(Stream<Map.Entry<String, Float>> evaluationCategory) {
        this.evaluationCategory = evaluationCategory;
    }

    public Stream<Map.Entry<String, Float>> getEvaluationAnonymization() {
        return evaluationAnonymization;
    }

    public void setEvaluationAnonymization(Stream<Map.Entry<String, Float>> evaluationAnonymization) {
        this.evaluationAnonymization = evaluationAnonymization;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPredicate() {
        return predicate;
    }

    public void setPredicate(String predicate) {
        this.predicate = predicate;
    }

    public ArrayList<String> getObject() {
        return object;
    }

    public void setObject(ArrayList<String> object) {
        this.object = object;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAnonymization() {
        return anonymization;
    }

    public void setAnonymization(String anonymization) {
        this.anonymization = anonymization;
    }

    /**
     * Is a given object mapped in the ontology?
     *
     * @param objectName An object name, e.g., DataDoors or Abs
     * @param classes    Mapped classes of sensors or categories in java
     * @return The object itself belonging to the ontology specified in java or null ("").
     */
    public String objectExist(String objectName, ArrayList<String> classes) {
        if (classes.contains(objectName)) return objectName;
        return "";
    }

    @Override
    public String toString() {
        return "Inferences{" +
                "subject='" + subject + '\'' +
                ", predicate='" + predicate + '\'' +
                ", object=" + object +
                ", type='" + type + '\'' +
                ", anonymization='" + anonymization + '\'' +
                '}' + "\n";
    }
}
