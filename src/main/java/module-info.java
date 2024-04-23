module com.example.javafx_hibernate_starter {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.naming;
    requires org.hibernate.orm.core;
    requires jakarta.persistence;
    requires static lombok;


    opens com.example.javafx_hibernate_starter;
    exports com.example.javafx_hibernate_starter;
    opens com.example.javafx_hibernate_starter.entity;
    exports com.example.javafx_hibernate_starter.entity;
    exports com.example.javafx_hibernate_starter.controller;
    opens com.example.javafx_hibernate_starter.controller;
}