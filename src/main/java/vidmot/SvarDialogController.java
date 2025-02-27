package vidmot;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
public class SvarDialogController {
    @FXML
    private Label SvarDialogText;

    @FXML
    private Button okSvarButton;
    @FXML
    private Button stopSvarButton;

    @FXML
    protected void onHelloButtonClick() {
        SvarDialogText.setText("Welcome to SvarDialogController!");
    }

    public void okSvarButton(ActionEvent event) {
    }

    public void stopSvarButton(ActionEvent event) {
    }
}
