package world.ucode.controls;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import world.ucode.utils.Utils;
import world.ucode.scenes.NewScene;

public class MenuControl {

    public Button new_game;
    public Button loadButton;
    public Button settingsButton;
    public Button exitButton;

    @FXML
    public void newGame() {
        Utils.playSound("click.mp3");
        (new NewScene("new_game.fxml")).setScene(); 
    }

    @FXML
    public void loadGame() {
        Utils.playSound("click.mp3");
        (new NewScene("Load.fxml")).setScene();
    }

    @FXML
    public void options() {
        Utils.playSound("click.mp3");
        (new NewScene("Setting.fxml")).setScene();
    }

    @FXML
    public void exit() {
        Utils.playSound("click.mp3"); 
        System.exit(0); 
    }

}