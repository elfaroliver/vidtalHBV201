package vidmot;

import hi.verkefni.vinnsla.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;

import java.io.IOException;
import java.util.Optional;

public class SvarDialogController extends Dialog<String> {
    @FXML
    private Label SvarDialogText;
    @FXML
    private TextField textFieldSvar;
    @FXML
    private Button okSvarButton;
    @FXML
    private Button stopSvarButton;

    private FeedbackService feedbackService = new FeedbackService();

    @FXML
    protected void onHelloButtonClick() {
        SvarDialogText.setText("Welcome to SvarDialogController!");
    }
    @FXML
    public void okSvarButton(ActionEvent event) {
        /*System.out.println("Í lagi takkinn");
        close();*/

        String input = textFieldSvar.getText();
        if (input != null && !input.trim().isEmpty()) {
            feedbackService.provideFeedback(input);
            setResult(input);
            close();
        } else {
            System.out.println("Engin svör eða svar er tómt!");
        }
    }
    @FXML
    public void stopSvarButton(ActionEvent event) {
        System.out.println("Hætta við takkinn");
        close();
    }

    public SvarDialogController(String selectedItem) {
        super(); // Algjört must til að kalla á Dialog<String> smiðinn, held ég
        setDialogPane(lesaSvarDialog());
        setTitle("Svar við spurningu");

        // Sanity check
        if (SvarDialogText != null) {
            SvarDialogText.setText(selectedItem);
        } else {
            System.out.println("SvarDialogText er null!");
        }
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

    /**
     * Tekið úr TextDialog frá Ebbu, viku5.
     */
    public void initialize() {

        // Textadialog búinn til
        TextInputDialog d = new TextInputDialog();

        // Birtum dialog-innm bíðum og fáum útkomuna
        // utkoma er af tagi sem inniheldur String
        Optional<String> utkoma = d.showAndWait();
        // Birtum svarið á console með því að nota get()
        if(utkoma.isPresent()) {
            System.out.println ("nafnið er "+utkoma.get());
        }
        else { // notandi ýtti á cancel
            System.out.println ("ekkert svar");
        }
        d.close();
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
