package hi.verkefni.vinnsla;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Dialog;

import java.util.HashMap;
import java.util.Map;

public class Spurningar extends Dialog<String> {
    private final ObservableList<String> flokkar = FXCollections.observableArrayList();
    private final Map<String, ObservableList<String>> spurningar = new HashMap<>();
    private final SimpleStringProperty fjoldiSvaradraSpurninga = new SimpleStringProperty("0");

    /**
     * Hérna eru spurningarnar fyrir ListView gluggana
     */
    public Spurningar() {
        flokkar.add("Færnispurningar"); // Færnispurningar
        flokkar.add("Tæknispurningar"); // Tæknispurningar

        ObservableList<String> flokkur1 = FXCollections.observableArrayList();

        flokkur1.add("Fæðingarstaður?");
        flokkur1.add("Heimilisfang?");
        flokkur1.add("Uppáhalds tannkrem?");

        ObservableList<String> flokkur2 = FXCollections.observableArrayList();

        flokkur2.add("Búinn að horfa á Young Justice?");
        flokkur2.add("Alltaf í boltanum?");
        flokkur2.add("Er Hideo Kojima ofmetinn?");

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
