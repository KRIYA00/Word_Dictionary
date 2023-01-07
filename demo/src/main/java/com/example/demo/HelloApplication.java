package com.example.demo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static Group root;

    @Override
    public void start(Stage stage) throws IOException {
       // FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        root=new Group();
        DictionaryPage d=new DictionaryPage();
        root.getChildren().add(d.root);
        Scene scene = new Scene(root, 500, 500);
        stage.setTitle("Dictionary Page");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}