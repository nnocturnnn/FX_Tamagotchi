package world.ucode.controls;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import world.ucode.Database;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import world.ucode.scenes.NewScene;


import java.net.URL;
import java.util.ResourceBundle;


public class SettingControl implements Initializable {

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
    public ImageView backgr;
    

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        sound = Database.getSoundSettings();
        background = Database.getThemeSettings();
        backgr.setImage(new Image(background));
        difficultySettings.setValue((Database.getDifficultySettings()));
    }

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
        String path = "/img/back" + background + ".png";
        String diff = difficultySettings.getValue();
        Database.updateSettings(sound, path, diff);
        (new NewScene("Setting.fxml")).setScene();
    }

}