package world.ucode.controls;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import world.ucode.scenes.NewScene;
import java.net.URL;
import world.ucode.Database;
import java.util.ResourceBundle;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.control.Label;

public class GameControl implements Initializable {

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
        Label label = new Label("0");
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