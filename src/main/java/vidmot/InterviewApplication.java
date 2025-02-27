package vidmot;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class InterviewApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*FXMLLoader fxmlLoader = new FXMLLoader(InterviewApplication.class.getResource("velkominn-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);*/

        // Búin til sena með einhverjum viðmótshlut
        var scene = new Scene(new Pane());

        // Setjum senuna sem núverandi senu
        ViewSwitcher.setScene(scene);

        // skiptum yfir í viðmótstré fyrir LOGIN
        ViewSwitcher.switchTo(View.VELKOMINN);
        stage.setTitle("Viðtal, amirite?");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}