package world.ucode.controls;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import world.ucode.Database;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import world.ucode.scenes.NewScene;


public class SettingControl {

    public Button sound_off;
    public Button sound_on;
    public Button backg_f;
    public Button backg_s;
    public ChoiceBox<String> difficultySettings;
    public String background;
    public String sound;
    public Button back;
    public Button play;

    @FXML
    public void sound_off() { 
        sound = "off";
    }

    @FXML
    public void sound_on() {
        sound = "on";
    }

    @FXML
    public void backg_f() {
        background = "1";
    }

    @FXML
    public void backg_s() {
        background = "2";
     }

    @FXML
    public void back() {
        (new NewScene("Menu.fxml")).setScene();
    }

    @FXML
    public void play() {
        Pane pane = new Pane();
        Image image = new Image("/img/back" + background + ".jpg");
        ImageView back = new ImageView(image);
        pane.add(back);
        String diff = difficultySettings.getValue();
        Database.updateSettings(sound, background, diff);
    }

}