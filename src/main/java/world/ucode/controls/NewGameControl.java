package world.ucode.controls;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import world.ucode.scenes.NewScene;
import javafx.scene.control.TextField;

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
        type = "pikachu";
    }

    @FXML
    public void chermander() {
        type = "chermander";
    }

    @FXML
    public void bulbasaur() {
        type = "bulbasaur";
    }

    @FXML
    public void squirtle() {
        type = "squirtle";
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