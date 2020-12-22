package world.ucode.controls;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import world.ucode.scenes.NewScene;

public class MenuControl {

    public Button new_game;
    public Button loadButton;
    public Button settingsButton;
    public Button exitButton;

    @FXML
    public void newGame() { 
        (new NewScene("new_game.fxml")).setScene(); 
    }

    @FXML
    public void loadGame() {
        (new NewScene("Load.fxml")).setScene();
    }

    @FXML
    public void options() {
        (new NewScene("Setting.fxml")).setScene();
    }

    @FXML
    public void exit() { System.exit(0); }

}