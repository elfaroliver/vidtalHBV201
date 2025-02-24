package hi.verkefni.vinnsla;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class KvedjaController {
    @FXML
    private Label KvedjaText;
    @FXML
    private Button KvedjaTakki;

    @FXML
    protected void onHelloButtonClick() {
        KvedjaText.setText("Welcome to KvedjaController!");
    }

    /**
     * fxKvedjaTakki lokar forritinu
     * @param event
     */
    public void fxKvedjaTakki(ActionEvent event) {
        // loka forriti
        boolean KvedjaTakki = true;
    }
}
