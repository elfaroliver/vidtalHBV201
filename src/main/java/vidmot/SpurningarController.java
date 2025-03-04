package vidmot;

import hi.verkefni.vinnsla.Spurningar;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextInputDialog;

import java.util.Optional;

public class SpurningarController {
    @FXML
    private Button fxSvaraSpurningar;
    @FXML
    private Button fxTilBakaSpurningar;
    @FXML
    private Button fxStopSpurningar;
    @FXML
    private Label fjoldiSvaradra;
    @FXML
    private ListView<String> fxListiSpurningar;
    @FXML
    private ListView<String> fxListiSpurningar1;
    private Spurningar spurningar = new Spurningar();

    /**
     * Setur spurningaflokkana í ListView kassana
     */
    public void initialize() {
        Spurningar spurningar = new Spurningar();

        if (!spurningar.getFlokkar().isEmpty()) {
            String valinnFlokkur = spurningar.getFlokkar().get(0);
            fxListiSpurningar.setItems(spurningar.getSpurningar().get(valinnFlokkur));
        }

        fxListiSpurningar.getSelectionModel().selectedIndexProperty().addListener((obs, old, newIndex) -> {
            if (newIndex.intValue() >= 0) {
                System.out.println("Ný spurning valin: " + fxListiSpurningar.getItems().get(newIndex.intValue()));
            }
        });
        // Veljum fyrsta flokkinn og birtum spurningarnar
        if (!spurningar.getFlokkar().isEmpty()) {
            String valinnFlokkur = spurningar.getFlokkar().get(1);
            fxListiSpurningar1.setItems(spurningar.getSpurningar().get(valinnFlokkur));
        }

        // Fylgist með breytingum á valinni spurningu
        fxListiSpurningar1.getSelectionModel().selectedIndexProperty().addListener((obs, old, newIndex) -> {
            if (newIndex.intValue() >= 0) {
                System.out.println("Ný spurning valin: " + fxListiSpurningar1.getItems().get(newIndex.intValue()));
            }
        });
    }


    /*@FXML
    protected void onHelloButtonClick() {
        SpurningarText.setText("Welcome to SpurningarController!");
    }*/

    /**
     * Takki til að opna valda spurningu. Allt dialog.set tekið úr TextDialog, viku 5
     * @param event
     */
    public void fxSvaraSpurningar(ActionEvent event) {
        System.out.println("Þessi takki svarar");
        TextInputDialog dialog = new TextInputDialog();

        String valinSpurning = fxListiSpurningar.getSelectionModel().getSelectedItem();
        String valinSpurning1 = fxListiSpurningar1.getSelectionModel().getSelectedItem();

        if (valinSpurning == null && valinSpurning1 == null) {
            System.out.println("Engin spurning valin!");
            return;
        }

        String spurningText;
        /*if (valinSpurning != null) {
            spurningText = valinSpurning;
        } else {
            spurningText = valinSpurning1;
        }*/

        if (valinSpurning1 != null && !valinSpurning1.isEmpty()) {
            spurningText = valinSpurning1;
        } else if (valinSpurning != null && !valinSpurning.isEmpty()) {
            spurningText = valinSpurning;
        } else {
            spurningText = "Engin spurning valin!";
        }

        dialog.setTitle(spurningText);
        dialog.setHeaderText(spurningText);
        dialog.setContentText("Svar hér, pls: " + spurningText);

        Optional<String> result = dialog.showAndWait();

        if (result.isPresent() && !result.get().trim().isEmpty()) {
            // Ef notandi skrifaði svar, hækka fjöldann
            int nyttFjoldi = Integer.parseInt(spurningar.getFjoldiSvaradraSpurninga()) + 1;
            fjoldiSvaradra.textProperty().bind(spurningar.fjoldiSvaradraSpurningaProperty());
            spurningar.setFjoldiSvaradraSpurninga(String.valueOf(nyttFjoldi));
        }

        //dialog.showAndWait();

        dialog.close();
    }

    /**
     * Til að fara úr spurningum í velkominn
     * @param event
     */
    public void fxTilBakaSpurningar(ActionEvent event) {
        ViewSwitcher.switchTo(View.VELKOMINN);
        System.out.println("Þessi takki fer til baka í velkominn");
    }

    /**
     * Til að fara úr spurningum í að hætta
     * @param event
     */
    public void fxStopSpurningar(ActionEvent event) {
        ViewSwitcher.switchTo(View.KVEDJA);
        System.out.println("Þessi takki hættir");
    }
}
