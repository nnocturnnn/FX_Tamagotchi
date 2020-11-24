package world.ucode.controls;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import world.ucode.scenes.NewScene;

public class SettingControl {

    public Button offy;
    public Button onny;
    public Button back1;
    public Button back2;
    // public Button backi;
    // public Button backy;

    @FXML
    public void sound_off() { 
        (new NewScene("new_game.fxml")).setScene(); 
    }

    @FXML
    public void sound_on() {
        (new NewScene("LoadGame.fxml")).setScene();
    }

    @FXML
    public void backg_f() {
        (new NewScene("Setting.fxml")).setScene();
    }

    @FXML
    public void backg_s() { System.exit(0); }

    @FXML
    public void back() { System.exit(0); }

    @FXML
    public void play() { System.exit(0); }

}