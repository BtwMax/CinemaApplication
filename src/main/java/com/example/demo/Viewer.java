package com.example.demo;

public class Viewer {

    private String nickname;
    private int age;
    private int filmCount;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getFilmCount() {
        return filmCount;
    }

    public void setFilmCount(int filmCount) {
        this.filmCount = filmCount;
    }

    public Viewer(String nickname, int age, int filmCount) {
        this.nickname = nickname;
        this.age = age;
        this.filmCount = filmCount;
    }

    public Viewer() {
    }
}
