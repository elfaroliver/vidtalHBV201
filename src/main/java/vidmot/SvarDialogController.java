package vidmot;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;

import java.io.IOException;

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
    
    public SvarDialogController() {
        setDialogPane(lesaSvarDialog());
    }

    private void setDialogPane(DialogPane dialogPane) {

    }

    private DialogPane lesaSvarDialog() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("svar-view.fxml"));
        try {
            // controller er settur sem þessi hlutur
            fxmlLoader.setController(this);
            return fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}
