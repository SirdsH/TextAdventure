package presentation.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

public class ControllerRoom2 {
    @FXML
    private Button leftArrow;

    @FXML
    private Button upArrow;

    @FXML
    private Button rightArrow;

    public void backBtn(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/gameScene.fxml"));
            Scene scene = new Scene(root, 600, 400);
            scene.getStylesheets().add("/styles/gameStyle.css");
            Window.myStage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void mainMenuBtn(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/sceneOne.fxml"));
            Scene scene = new Scene(root, 600, 400);
            scene.getStylesheets().add("/styles/style.css");
            Window.myStage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void nextRoomBtn(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/RoomStyle3.fxml"));
            Scene scene = new Scene(root, 600, 400);
            scene.getStylesheets().add("/styles/gameStyle.css");
            Window.myStage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
