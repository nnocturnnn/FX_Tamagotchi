package world.ucode.controls;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import world.ucode.scenes.NewScene;

public class GameControl {

    public Button chermander;
    public Button squirtle;
    public Button bulbasaur;
    public Button exitButton;
    public Button backButton;
    public Button pikachu;

    @FXML
    public ImageView backgr;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        backgr.setImage(new Image(Database.getThemeSettings()));
    }

    @FXML
    public void pill() { 
        (new NewScene("new_game.fxml")).setScene(); 
    }

    @FXML
    public void water() {
        (new NewScene("LoadGame.fxml")).setScene();
    }

    @FXML
    public void soap() {
        (new NewScene("Setting.fxml")).setScene();
    }

    @FXML
    public void back() {
        (new NewScene("Menu.fxml")).setScene();
    }

    @FXML
    public void play() { System.exit(0); }

    @FXML
    public void eat() {
        (new NewScene("Menu.fxml")).setScene();
    }

}