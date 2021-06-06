package presentation.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import java.io.IOException;

public class ControllerRoom4 {
    @FXML
    private Button tryBtn;
    @FXML
    private Button leftArrow;
    @FXML
    private Button upArrow;
    @FXML
    private Button rightArrow;

    public void giveTryBtn(ActionEvent actionEvent) {
        //*right
        if (percentageChanceTwo(0.40)) {
            System.out.println("Lucky");
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/RoomStyle5.fxml"));
                Scene scene = new Scene(root, 600, 400);
                scene.getStylesheets().add("/styles/style.css");
                Window.myStage.setScene(scene);
                Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                alert1.setTitle("You have won!");
                alert1.setHeaderText("You have won!");
                alert1.setContentText("Congratulation you have just won the game!");
                alert1.showAndWait();
                try {
                    Parent root1 = FXMLLoader.load(getClass().getResource("/sceneOne.fxml"));
                    Scene scene1 = new Scene(root1, 600, 400);
                    scene1.getStylesheets().add("/styles/style.css");
                    Window.myStage.setScene(scene1);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (percentageChanceTwo(0.60)) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("You died!");
            alert.setHeaderText("You died!");
            alert.setContentText("You got into a fight and died!");
            alert.showAndWait();
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/sceneOne.fxml"));
                Scene scene = new Scene(root, 600, 400);
                scene.getStylesheets().add("/styles/style.css");
                Window.myStage.setScene(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
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
        //*left
        if (percentageChanceOne(0.60)) {
            System.out.println("Lucky");
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/RoomStyle5.fxml"));
                Scene scene = new Scene(root, 600, 400);
                scene.getStylesheets().add("/styles/gameStyle.css");
                Window.myStage.setScene(scene);
                Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                alert1.setTitle("You have won!");
                alert1.setHeaderText("You have won!");
                alert1.setContentText("Congratulation you have just won the game!");
                alert1.showAndWait();
                try {
                    Parent root1 = FXMLLoader.load(getClass().getResource("/sceneOne.fxml"));
                    Scene scene1 = new Scene(root1, 600, 400);
                    scene1.getStylesheets().add("/styles/style.css");
                    Window.myStage.setScene(scene1);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (percentageChanceOne(0.40)) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("You died!");
            alert.setHeaderText("You died!");
            alert.setContentText("You got into a fight and died!");
            alert.showAndWait();
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/sceneOne.fxml"));
                Scene scene = new Scene(root, 600, 400);
                scene.getStylesheets().add("/styles/style.css");
                Window.myStage.setScene(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void backBtn(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/RoomStyle3.fxml"));
            Scene scene = new Scene(root, 600, 400);
            scene.getStylesheets().add("/styles/gameStyle.css");
            Window.myStage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Boolean percentageChanceOne(double chance) {
        return Math.random() <= chance;
    }

    public static Boolean percentageChanceTwo(double chance) {
        return Math.random() <= chance;
    }
}
