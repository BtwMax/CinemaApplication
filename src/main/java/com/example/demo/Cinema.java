package com.example.demo;

public class Cinema {
    private String filmName;
    private String genre;
    private double time;

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public Cinema(String filmName, String genre, double time) {
        this.filmName = filmName;
        this.genre = genre;
        this.time = time;
    }

    public Cinema() {
    }
}
