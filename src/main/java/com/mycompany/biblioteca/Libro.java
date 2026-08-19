package com.mycompany.biblioteca;

public class Libro extends Material {

    private String genre;

    public Libro(String code, String title, String author, String genre) {
        super(code, title, author);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}