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

    public void fxByrjaSpurningarHandler(ActionEvent event) {
        // Fara í spurningar
        ViewSwitcher.switchTo(View.SPURNINGAR);
        System.out.println("Þessi takki fer í spurningar");
    }

    public void fxStopButtonHandler(ActionEvent event) {
        // Hætta strax
        ViewSwitcher.switchTo(View.KVEDJA);
        System.out.println("Þessi takki fer í hætta");
    }
}