package vidmot;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
public class SvarDialogController {
    @FXML
    private Label SvarDialogText;

    @FXML
    private Button fxOkSvarButton;
    @FXML
    private Button fxStopSvarButton;

    @FXML
    protected void onHelloButtonClick() {
        SvarDialogText.setText("Welcome to SvarDialogController!");
    }


    public void fxOkSvarButton(ActionEvent event) {
        
    }

    public void fxStopSvarButton(ActionEvent event) {

    }
}
