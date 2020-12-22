package world.ucode.controls;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import world.ucode.scenes.NewScene;
import world.ucode.utils.*;
import java.net.URL;
import world.ucode.Database;
import world.ucode.Model;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.util.ResourceBundle;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import java.util.ArrayList;
import javafx.scene.shape.Rectangle;
import javafx.geometry.Rectangle2D;
import javafx.util.Duration;
import world.ucode.utils.SpriteAnimation;

public class GameControl implements Initializable {

    public Button chermander;
    public Button squirtle;
    public Button bulbasaur;
    public Button exitButton;
    public Button backButton;
    public Button pikachu;
    public int count = 3;
    public int columns = 3;
    public int offsetX = 0;
    public int offsetY = 0;
    public int width = 39;
    public int height = 41;
    public int score = 0;
    public Rectangle removeRect = null;
    public SpriteAnimation animation;

    private Model pet;

    @FXML public ImageView backgr;
    @FXML public Label name_pet;
    @FXML public ImageView hero;
    @FXML public Label helsi;
    @FXML public Pane rootPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        pet = new Model(hero);
        hero.setImage(new Image("/img/" + pet.getType() + "_lil.png"));
        backgr.setImage(new Image(Database.getThemeSettings()));
        name_pet.setText(pet.getName());
        helsi.setText("health: " + String.valueOf(pet.getHealth()));
        hero.setViewport(new Rectangle2D(offsetX,offsetY,width,height));
        animation = new SpriteAnimation(hero,Duration.millis(500),count,columns,offsetX,offsetY,width,height);
        animation.play();
        ImageView poke = new ImageView(new Image("/img/" + "pokeball.png",100,50,false,false));
        Button retry = new Button("", poke);
        int x = (int)Math.floor(Math.random()*600);
        int y = (int)Math.floor(Math.random()*600);
        retry.setLayoutX(x);
        retry.setLayoutY(y);
        retry.setStyle("-fx-background-color: transparent; -fx-text-fill: #535353;");
        retry.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println(50);
            }
        });
        rootPane.getChildren().addAll(retry);
    }
    

    @FXML
    public void pill() { 
        System.out.println("pill");
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