package com.example.javafx_hibernate_starter.controller;

import com.example.javafx_hibernate_starter.SceneController;
import com.example.javafx_hibernate_starter.dao.ExampleDAO;
import javafx.event.ActionEvent;

import java.io.IOException;

public class ExampleViewController {


    public void goToExample2(ActionEvent event) throws IOException {
        SceneController.getExample2Scene(event);
    }

    public void addToDatabase(ActionEvent event) {
        ExampleDAO exampleDAO = new ExampleDAO();
        exampleDAO.addPlaceholder();
    }
}
