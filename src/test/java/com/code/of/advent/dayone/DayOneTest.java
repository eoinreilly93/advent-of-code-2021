package com.code.of.advent.dayone;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayOneTest {

    private DayOne dayOne;

    @BeforeEach
    public void setUp() throws IOException {
        int[] input = Files.readAllLines(Paths.get("src/test/resources/dayOneInput.txt")).stream()
                .mapToInt(Integer::parseInt).toArray();
        this.dayOne = new DayOne(input);
    }

    @Test
    public void testPartOne() {
        int result = dayOne.partOne();
        assertEquals(1316, result);
    }

    @Test
    public void testPartTwo() {
        int result = dayOne.partTwo();
        assertEquals(1344, result);
    }
}