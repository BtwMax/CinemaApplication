package com.example.demo;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.OptionalDouble;


@SpringBootApplication
public class CinemaApplicationRun {

    public static void main(String[] args) {

        ViewerStatistics viewerStatistics = new ViewerStatistics();

        Viewer viewer = new Viewer();
        viewer.setNickname("qwe");
        viewer.setAge(20);
        viewer.setFilmCount(10);

        Viewer viewer1 = new Viewer();
        viewer1.setNickname("wqe");
        viewer1.setAge(19);
        viewer1.setFilmCount(13);

        Viewer viewer2 = new Viewer();
        viewer2.setNickname("ert");
        viewer2.setAge(25);
        viewer2.setFilmCount(26);

        Viewer viewer3 = new Viewer();
        viewer3.setNickname("sdf");
        viewer3.setAge(23);
        viewer3.setFilmCount(50);

        Viewer viewer4 = new Viewer();
        viewer4.setNickname("zxc");
        viewer4.setAge(26);
        viewer4.setFilmCount(58);

        System.out.println(viewerStatistics.averageAge(viewer.getAge(), viewer1.getAge(), viewer2.getAge(), viewer3.getAge(), viewer4.getAge()));

    }

}
