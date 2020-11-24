package world.ucode.controls;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import world.ucode.scenes.NewScene;

public class NewGameControl {

    public Button chermander;
    public Button squirtle;
    public Button bulbasaur;
    public Button exitButton;
    public Button backButton;
    public Button pikachu;

    @FXML
    public void pikachu() { 
        (new NewScene("new_game.fxml")).setScene(); 
    }

    @FXML
    public void chermander() {
        (new NewScene("LoadGame.fxml")).setScene();
    }

    @FXML
    public void bulbasaur() {
        (new NewScene("Setting.fxml")).setScene();
    }

    @FXML
    public void squirtle() {
        (new NewScene("Setting.fxml")).setScene();
    }

    @FXML
    public void quit() { System.exit(0); }

    @FXML
    public void back() {
        (new NewScene("Menu.fxml")).setScene();
    }

}