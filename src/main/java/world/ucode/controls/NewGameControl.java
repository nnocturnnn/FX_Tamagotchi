package world.ucode.controls;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import world.ucode.scenes.NewScene;
import javafx.scene.control.TextField;
import world.ucode.Database;

public class NewGameControl {

    public String type;
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
        this.type = "pikachu";
    }

    @FXML
    public void chermander() {
        this.type = "chermander";
    }

    @FXML
    public void bulbasaur() {
        this.type = "bulbasaur";
    }

    @FXML
    public void squirtle() {
        this.type = "squirtle";
    }

    @FXML
    public void play() {
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
        (new NewScene("Menu.fxml")).setScene();
    }

}