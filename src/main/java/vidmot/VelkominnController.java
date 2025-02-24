package vidmot;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class VelkominnController {
    public Button StopButton;
    public Button ByrjaSpurningar;
    @FXML
    private Label welcomeText;
    @FXML
    private Button fxByrjaSpurningar;
    @FXML
    private Button fxStopButton;

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