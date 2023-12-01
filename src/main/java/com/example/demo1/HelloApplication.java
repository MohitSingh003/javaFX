package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public void start(Stage primaryStage) throws Exception{

        Group groupRoot = new Group();
        Scene newScene = new Scene(groupRoot, Color.BLACK);
        
//        Image appIcon = new Image("img.png");

//        primaryStage.getIcons().add(appIcon);


        primaryStage.setTitle("First App");
        primaryStage.setScene(newScene);
        primaryStage.setHeight(420);
        primaryStage.setWidth(420);
//        primaryStage.setResizable(false);
        primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitHint("You can't escape until you press w");
        primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("w"));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}