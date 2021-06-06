package presentation.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.Optional;

public class Controller {

    @FXML
    private Text containerText1;

    @FXML
    private Button upArrow;

    @FXML
    private Button leftArrow;

    @FXML
    private Button rightArrow;

    @FXML
    private Button optionBtn;

    @FXML
    private Label nicknameOutput;

    @FXML
    private TextField nicknameField;

    @FXML
    private Button startBtn;

    @FXML
    private Button exitBtn;

    @FXML
    private Label textTitle;

    @FXML
    public void goToOption(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Under Maintenance");
        alert.setHeaderText("Under Maintenance");
        alert.setContentText("We are sorry, but this game is in beta version, so we don't include options!");
        alert.showAndWait();
    }

    @FXML
    public void exitGame(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("Do you really want to exit?");
        alert.setContentText("If yes, we hope to see you soon!!");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            System.out.println("Okay");
            System.exit(0);
        } else {
            System.out.println("Cancel");
        }
    }

    public void goToGame(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/gameScene.fxml"));
            Scene scene = new Scene(root, 600, 400);
            scene.getStylesheets().add("/styles/gameStyle.css");
            Window.myStage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setNickname(ActionEvent actionEvent) {
        String input = nicknameField.getText();
        nicknameOutput.setText(input);
    }

    public void nextRoomBtn(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/RoomStyle2.fxml"));
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

    public void backBtn(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("You can't go back from first room!");
        alert.setHeaderText("You can't go back from first room!");
        alert.setContentText("Please go to the next room first! Thank you!");
        alert.showAndWait();
    }
}
