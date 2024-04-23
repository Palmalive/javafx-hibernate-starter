package com.example.javafx_hibernate_starter;

import com.example.javafx_hibernate_starter.util.HibernateUtil;
import javafx.application.Application;
import javafx.stage.Stage;
import org.hibernate.Session;

import java.io.IOException;

public class App extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void init() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.close();
    }

    @Override
    public void start(Stage stage) throws IOException {
        SceneController.getInitialScene(stage);
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        HibernateUtil.shutdown();
    }
}