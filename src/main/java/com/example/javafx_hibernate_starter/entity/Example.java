package com.example.javafx_hibernate_starter.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Example {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String string;

    public Example(String string) {
        this.string = string;
    }

    public Example() {

    }
}
