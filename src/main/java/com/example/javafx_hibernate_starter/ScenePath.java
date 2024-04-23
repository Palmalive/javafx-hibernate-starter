package com.example.javafx_hibernate_starter;

import lombok.Getter;

@Getter
public enum ScenePath {
    EXAMPLE("views/example-view.fxml"),
    EXAMPLE2("views/example2-view.fxml");

    private final String path;

    ScenePath(String path) {
        this.path = path;
    }
}
