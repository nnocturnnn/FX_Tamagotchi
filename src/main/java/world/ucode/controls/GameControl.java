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
    public int score = 0;
    public Rectangle removeRect = null;
    public SpriteAnimation animation;

    private Model pet;

    @FXML public ImageView backgr;
    @FXML public Label name_pet;
    @FXML public ImageView hero;
    @FXML public Label helsi;
    @FXML public Pane rootPane;
    @FXML public Label coin;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        pet = new Model(hero);
        hero.setImage(new Image("/img/" + pet.getType() + "_lil.png"));
        backgr.setImage(new Image(Database.getThemeSettings()));
        name_pet.setText(pet.getName());
        helsi.setText("health: " + String.valueOf(pet.getHealth()));
        coin.setText(String.valueOf(pet.getTired()));
        animation_type(1);
    }
    
    public void animation_type(int type) {
        if (type == 1)
            standart_animation();
        else if (type == 2)
            sad_animation();
        else if (type == 3)
            play_animation();
        else if (type == 4)
            eat_animation();
        else if (type == 5)
            run_animation();
    }

    public void standart_animation() {
        if (pet.getType().equals("pikachu")) {
            hero.setViewport(new Rectangle2D(0,0,39,41));
            animation = new SpriteAnimation(hero,Duration.millis(500),3,3,0,0,39,41);
        } else if (pet.getType().equals("chermander")) {
            hero.setViewport(new Rectangle2D(0,0,39,41));
            animation = new SpriteAnimation(hero,Duration.millis(500),3,3,1,0,40,39);
        } else if (pet.getType().equals("squirtle")) {
            hero.setViewport(new Rectangle2D(0,0,39,41));
            animation = new SpriteAnimation(hero,Duration.millis(500),3,3,0,0,38,38);
        } else if (pet.getType().equals("bulbasaur")) {
            hero.setViewport(new Rectangle2D(0,0,39,41));
            animation = new SpriteAnimation(hero,Duration.millis(500),3,3,0,0,34,31);
        }
        animation.play();
    }

    public void sad_animation() {

    }

    public void play_animation() {

    }

    public void eat_animation() {

    }

    public void run_animation() {

    }

    @FXML
    public void pill() {
        Utils.playSound("levelup.mp3");
        coin.setText(String.valueOf(pet.getTired() - 10));
        pet.setTired(pet.getTired() - 10);
    }

    @FXML
    public void water() {
        Utils.playSound("drink.mp3");
        coin.setText(String.valueOf(pet.getTired() - 10));
        pet.setTired(pet.getTired() - 10);
    }

    @FXML
    public void soap() {
        Utils.playSound("eat2.mp3");
        coin.setText(String.valueOf(pet.getTired() - 10));
        pet.setTired(pet.getTired() - 10);
    }

    @FXML
    public void back() {
        Database.saveModel(pet);
        (new NewScene("Menu.fxml")).setScene();
    }

    @FXML
    public void play() {
        int rand = (int)Math.floor(Math.random()*100);
        ImageView poke;
        if (rand == 1)
            poke = new ImageView(new Image("/img/" + "pokedex.png",100,50,false,false));
        else
            poke = new ImageView(new Image("/img/" + "pokeball.png",100,50,false,false));

        Button retry = new Button("", poke);
        int x = (int)Math.floor(Math.random()*500);
        int y = (int)Math.floor(Math.random()*500);
        retry.setLayoutX(x);
        retry.setLayoutY(y);
        retry.setStyle("-fx-background-color: transparent; -fx-text-fill: #535353;");
        retry.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                int x = (int)Math.floor(Math.random()*500);
                int y = (int)Math.floor(Math.random()*500);
                retry.setLayoutX(x);
                retry.setLayoutY(y);
                pet.setTired(pet.getTired() + 1);
                coin.setText(String.valueOf(pet.getTired() + 1));
            }
        });
        rootPane.getChildren().addAll(retry);
    }

    @FXML
    public void eat() {             // soap
        Utils.playSound("splash2.mp3");
        coin.setText(String.valueOf(pet.getTired() - 10));
        pet.setTired(pet.getTired() - 10);
    }

}