package vidmot;

import hi.verkefni.vinnsla.Spurningar;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class SpurningarController {
    /*@FXML
    private Label SpurningarText;*/
    @FXML
    private Button fxSvaraSpurningar;
    @FXML
    private Button fxTilBakaSpurningar;
    @FXML
    private Button fxStopSpurningar;
    @FXML
    private ListView<String> fxListiSpurningar;
    @FXML
    private ListView<String> fxListiSpurningar1;

    private Spurningar spurningar = new Spurningar();

    /*public void initialize() {
        fxListiSpurningar.getSelectionModel().selectedIndexProperty()
                .addListener((obs, old, newIndex) -> {});
    }*/

    public void initialize() {
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

    public void fxSvaraSpurningar(ActionEvent event) {
        System.out.println("Þessi takki svarar");
        String valinSpurning = fxListiSpurningar.getSelectionModel().getSelectedItem();
        if (valinSpurning != null) {
            SvarDialogController dialog = new SvarDialogController(valinSpurning);
            dialog.showAndWait();
        } else {
            System.out.println("Engin spurning valin!");
        }
    }

    public void fxTilBakaSpurningar(ActionEvent event) {
        ViewSwitcher.switchTo(View.VELKOMINN);
        System.out.println("Þessi takki fer til baka í spurningar");
    }

    public void fxStopSpurningar(ActionEvent event) {
        ViewSwitcher.switchTo(View.KVEDJA);
        System.out.println("Þessi takki hættir");
    }

    /*public static void main(String[] args) {
        SvarDialogController dialog = new SvarDialogController("Spurning 1");
        dialog.showAndWait();
    }*/
}
