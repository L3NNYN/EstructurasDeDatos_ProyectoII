package cr.ac.una.waze;

import cr.ac.una.waze.util.FlowController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        FlowController.getInstance().InitializeFlow(stage,null);
        FlowController.getInstance().goViewInWindow("MenuPrincipal");
    }

    public static void main(String[] args) {
        launch();
    }

}