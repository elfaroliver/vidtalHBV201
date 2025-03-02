package vidmot;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;

import java.io.IOException;

public class SvarDialogController extends Dialog<String> {
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
    @FXML
    public void okSvarButton(ActionEvent event) {
        System.out.println("Í lagi takkinn");
        close();
    }
    @FXML
    public void stopSvarButton(ActionEvent event) {
        System.out.println("Hætta við takkinn");
        close();
    }
    
    public SvarDialogController(String selectedItem) {
        setDialogPane(lesaSvarDialog());
        setTitle("Svar við spurningu");
        SvarDialogText.setText(selectedItem);
    }

    @FXML
    private void onOkSvarButtonClicked() {
        setResult("Svar staðfest!");
        close();
    }

    @FXML
    private void onStopSvarButtonClicked() {
        setResult(null);
        close();
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
