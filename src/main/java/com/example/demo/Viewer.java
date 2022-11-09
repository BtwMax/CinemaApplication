package com.example.demo;

public class Viewer {

    private String nickname;
    private int age;
    private Cinema cinemaCount;

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

    public Cinema getCinemaCount() {
        return cinemaCount;
    }

    public void setCinemaCount(Cinema cinemaCount) {
        this.cinemaCount = cinemaCount;
    }

    public Viewer(String nickname, int age, Cinema cinemaCount) {
        this.nickname = nickname;
        this.age = age;
        this.cinemaCount = cinemaCount;
    }

    public Viewer() {
    }
}
