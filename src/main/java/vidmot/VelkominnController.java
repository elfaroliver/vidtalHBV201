package hi.verkefni.vinnsla;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class VelkominnController {
    @FXML
    private Label welcomeText;
    @FXML
    private Button ByrjaSpurningar;
    @FXML
    private Button StopButton;
    @FXML
    private Label VelkominnText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void fxByrjaSpurningar(ActionEvent event) {
        // Fara í spurningar
    }

    public void fxStopButton(ActionEvent event) {
        // Hætta strax
    }
}