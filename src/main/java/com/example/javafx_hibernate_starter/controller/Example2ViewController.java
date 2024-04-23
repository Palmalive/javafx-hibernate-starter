package com.example.javafx_hibernate_starter.controller;

import com.example.javafx_hibernate_starter.SceneController;
import com.example.javafx_hibernate_starter.dao.ExampleDAO;
import com.example.javafx_hibernate_starter.entity.Example;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.List;


public class Example2ViewController {

    @FXML
    private VBox vBox;

    public void goToExample(ActionEvent event) throws IOException {
        SceneController.getExampleScene(event);
    }

    @FXML
    public void initialize() {
        ExampleDAO exampleDAO = new ExampleDAO();
        List<Example> examples = exampleDAO.findAll();

        ObservableList<Node> children = vBox.getChildren();

        for (Example example : examples) {
            children.add(new Label(example.getId() + " " + example.getString()));
        }
    }

}
