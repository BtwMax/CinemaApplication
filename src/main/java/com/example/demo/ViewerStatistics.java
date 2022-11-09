package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

@Component("viewerStatistics")
public class ViewerStatistics {

    public OptionalDouble averageAge (int... values) {
        return IntStream.of(values).average();
    }
}
