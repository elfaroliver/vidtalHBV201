package hi.verkefni.vinnsla;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.HashMap;
import java.util.Map;

public class Spurningar {
    private final ObservableList<String> flokkar = FXCollections.observableArrayList();
    private final Map<String, ObservableList<String>> spurningar = new HashMap<>();
    private final SimpleStringProperty fjoldiSvaradraSpurninga = new SimpleStringProperty("0");

    public Spurningar() {
        flokkar.add("Færnispurningar"); // Færnispurningar
        flokkar.add("Tæknispurningar"); // Tæknispurningar

        ObservableList<String> flokkur1 = FXCollections.observableArrayList();

        flokkur1.add("Spurning 1");
        flokkur1.add("Spurning 2");
        flokkur1.add("Spurning 3");

        ObservableList<String> flokkur2 = FXCollections.observableArrayList();

        flokkur2.add("Spurning 1");
        flokkur2.add("Spurning 2");
        flokkur2.add("Spurning 3");

        spurningar.put(flokkar.get(0), flokkur1);
        spurningar.put(flokkar.get(1), flokkur2);
    }

    public ObservableList<String> getFlokkar() {
        return flokkar;
    }

    public Map<String, ObservableList<String>> getSpurningalisti(String færnispurningar) {
        return spurningar;
    }

    public Map<String, ObservableList<String>> getSpurningar() {
        return spurningar;
    }

    public String getFjoldiSvaradraSpurninga() {
        return fjoldiSvaradraSpurninga.get();
    }

    public SimpleStringProperty fjoldiSvaradraSpurningaProperty() {
        return fjoldiSvaradraSpurninga;
    }

    public void setFjoldiSvaradraSpurninga(String fjoldiSvaradraSpurninga) {
        this.fjoldiSvaradraSpurninga.set(fjoldiSvaradraSpurninga);
    }
    public static void main (String [] args) {
        Spurningar spurningar = new Spurningar();
        System.out.println (spurningar.getSpurningalisti("Færnispurningar").get(1));
        System.out.println (spurningar.getSpurningalisti("Tæknispurningar").get(0));
        System.out.println (spurningar.getFlokkar());
    }
}
