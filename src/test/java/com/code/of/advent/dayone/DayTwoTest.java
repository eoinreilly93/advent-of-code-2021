package com.code.of.advent.dayone;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class DayTwoTest {

    private List<DayTwo.Command> commands;
    private DayTwo dayTwo;

    @BeforeEach
    void setUp() throws IOException {
        this.commands = Files.readAllLines(Paths.get("src/test/resources/dayTwoInput.txt")).stream().map(line -> {
            String[] arr = line.split(" ");
            return new DayTwo.Command(arr[0], Integer.parseInt(arr[1]));
        }).collect(Collectors.toList());

        dayTwo = new DayTwo(commands);
    }

    @Test
    void partOne() {
        int result = dayTwo.partOne();
        assertEquals(1813801, result);
    }

    @Test
    void partTwo() {
        int result = dayTwo.partTwo();
        assertEquals(1960569556, result);
    }
}