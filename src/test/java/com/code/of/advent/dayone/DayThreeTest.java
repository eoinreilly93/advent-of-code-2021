package com.code.of.advent.dayone;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class DayThreeTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void partOne() throws IOException {
//        List<char[]> input = Files.readAllLines(Paths.get("src/test/resources/dayThreeInput.txt")).stream()
//                .map(String::toCharArray)
//                .collect(Collectors.toList());
        List<String> input = new ArrayList<>(Files.readAllLines(Paths.get("src/test/resources/dayThreeInput.txt")));

        DayThree dayThree = new DayThree();
        int result = dayThree.partOne(input);
        assertEquals(2954600, result);
    }

    @Test
    void partTwo() {
    }
}