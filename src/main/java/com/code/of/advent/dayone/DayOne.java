package com.code.of.advent.dayone;

public class DayOne {

    private final int[] depthMeasurements;

    public DayOne(int[] depthMeasurements) {
        this.depthMeasurements = depthMeasurements;
    }

    public int partOne() {
        int countOfDepthMeasurementIncreases = 0;
        for (int i = 1; i < depthMeasurements.length; i++) {
            if (depthMeasurements[i] > depthMeasurements[i - 1]) {
                countOfDepthMeasurementIncreases++;
            }
        }
        return countOfDepthMeasurementIncreases;
    }

    public int partTwo() {
        int countOfSlidingWindowDepthMeasurementIncreases = 0;
        int sumOfPreviousWindow = 0;

        for (int i = 0; i < depthMeasurements.length; i++) {
            int sumOfCurrentWindow = 0;
            for (int j = 0; j < 3; j++) {
                if (i + j >= depthMeasurements.length) {
                    break;
                }
                sumOfCurrentWindow += depthMeasurements[i + j];
            }
            if (i != 0 && sumOfCurrentWindow > sumOfPreviousWindow) {
                countOfSlidingWindowDepthMeasurementIncreases++;
            }
            sumOfPreviousWindow = sumOfCurrentWindow;
        }

        return countOfSlidingWindowDepthMeasurementIncreases;
    }

    public int partTwoTwo() {
        int countOfSlidingWindowDepthMeasurementIncreases = 0;
        for (int i = 3; i < depthMeasurements.length; i++) {
            int prev = depthMeasurements[i - 3] + depthMeasurements[i - 2] + depthMeasurements[i - 1];
            int next = depthMeasurements[i - 2] + depthMeasurements[i - 1] + depthMeasurements[i];
            if (prev < next) {
                countOfSlidingWindowDepthMeasurementIncreases++;
            }
        }
        return countOfSlidingWindowDepthMeasurementIncreases;
    }
}
