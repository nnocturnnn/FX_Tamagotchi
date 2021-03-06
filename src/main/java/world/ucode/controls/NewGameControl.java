package world.ucode.controls;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import world.ucode.scenes.NewScene;
import javafx.scene.control.TextField;
import world.ucode.utils.Utils;
import world.ucode.Database;

public class NewGameControl {

    public String type = "pikachu";
    public TextField petNameBox;
    public TextField petHealthBox;
    public Button chermander;
    public Button squirtle;
    public Button bulbasaur;
    public Button exitButton;
    public Button backButton;
    public Button pikachu;

    @FXML
    public void pikachu() {
        Utils.playSound("pika.mp3");
        this.type = "pikachu";
    }

    @FXML
    public void chermander() {
        Utils.playSound("char.mp3");
        this.type = "chermander";
    }

    @FXML
    public void bulbasaur() {
        Utils.playSound("bulbasaur.mp3");
        this.type = "bulbasaur";
    }

    @FXML
    public void squirtle() {
        Utils.playSound("squirt.mp3");
        this.type = "squirtle";
    }

    @FXML
    public void play() {
        Utils.playSound("click.mp3");
        String health = petHealthBox.getText();
        if (health.equals("")) {
            health = "10";
        }
        Database.insertNewDB(petNameBox.getText(), type, 
                            Integer.parseInt(health));
        (new NewScene("Game.fxml")).setScene();
    }

    @FXML
    public void back() {
        Utils.playSound("click.mp3");
        (new NewScene("Menu.fxml")).setScene();
    }

}