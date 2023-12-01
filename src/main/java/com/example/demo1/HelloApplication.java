package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public void start(Stage primaryStage) throws Exception{

        Group groupRoot = new Group();
        Scene newScene = new Scene(groupRoot, Color.BLACK);

        primaryStage.setTitle("First App");
        primaryStage.setScene(newScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}