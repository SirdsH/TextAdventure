package presentation.gui;

import com.sun.javafx.stage.EmbeddedWindow;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Window extends Application {

    public static Stage myStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sceneOne.fxml"));

        Scene scene = new Scene(root, 600, 400);
        myStage = primaryStage;
        scene.getStylesheets().add("/styles/style.css");
        primaryStage.setScene(scene);
        primaryStage.setTitle("Magium");
        primaryStage.show();
    }
}
