package world.ucode.controls;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import world.ucode.scenes.NewScene;
import world.ucode.utils.*;
import java.net.URL;
import world.ucode.Database;
import world.ucode.Model;
import java.util.ResourceBundle;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.control.Label;
import javafx.animation.AnimationTimer;

public class GameControl implements Initializable {

    public Button chermander;
    public Button squirtle;
    public Button bulbasaur;
    public Button exitButton;
    public Button backButton;
    public Button pikachu;

    private Model pet;

    @FXML public ImageView backgr;
    @FXML public Label name_pet;
    @FXML public ImageView hero;
    @FXML public Label helsi;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        pet = new Model();
        hero.setImage(new Image("/img/" + pet.getType() + "_lil.png"));
        backgr.setImage(new Image(Database.getThemeSettings()));
        name_pet.setText(pet.getName());
        helsi.setText("health: " + String.valueOf(pet.getHealth()));
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                this.stop();
                update();
            }
        };
        timer.start();

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