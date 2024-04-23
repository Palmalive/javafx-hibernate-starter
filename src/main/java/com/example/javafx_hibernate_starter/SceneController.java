package com.example.javafx_hibernate_starter;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SceneController {

    private static Parent main;

    public static void getInitialScene(Stage stage) throws IOException {
        main = FXMLLoader.load(Objects.
                requireNonNull(SceneController.class.getResource(ScenePath.EXAMPLE.getPath())));
        Scene scene = new Scene(main);
        stage.setTitle("Название окна");
        stage.setScene(scene);
        stage.show();
    }

    public static void getExample2Scene(ActionEvent event) throws IOException {
        changeScreen(event, ScenePath.EXAMPLE2.getPath());
    }

    public static void getExampleScene(ActionEvent event) throws IOException {
        changeScreen(event, ScenePath.EXAMPLE.getPath());
    }


    private static void changeScreen(ActionEvent event, String path) throws IOException {
        main = FXMLLoader.load(Objects
                .requireNonNull(SceneController.class.getResource(path)));
        Scene visitScene = new Scene(main);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(visitScene);
        window.show();
    }

}

