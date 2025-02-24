package vidmot;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SpurningarController {
    @FXML
    private Label SpurningarText;
    @FXML
    private Button fxSvaraSpurningar;
    @FXML
    private Button fxTilBakaSpurningar;
    @FXML
    private Button fxStopSpurningar;


    @FXML
    protected void onHelloButtonClick() {
        SpurningarText.setText("Welcome to SpurningarController!");
    }

    public void fxSvaraSpurningar(ActionEvent event) {
        System.out.println("Þessi takki svarar");
    }

    public void fxTilBakaSpurningar(ActionEvent event) {
        System.out.println("Þessi takki fer til baka");
    }

    public void fxStopSpurningar(ActionEvent event) {
        System.out.println("Þessi takki hættir");
    }
}
