package com.example.springintegrationtest.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String author;

    // Getters ve Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String adi) {
        this.name = adi;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String yazar) {
        this.author = yazar;
    }
}

