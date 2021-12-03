package com.code.of.advent.dayone;

import java.util.List;

public class DayThree {

    public int partOne(List<String> input) {
        int zeros = 0;
        int ones = 0;
        StringBuilder gammaRate = new StringBuilder();
        for (int i = 0; i < input.get(0).length(); i++) {
            for (String s : input) {
                if (s.charAt(i) == '1') {
                    ones++;
                } else if (s.charAt(i) == '0') {
                    zeros++;
                }
            }
            if (zeros > ones) {
                gammaRate.append("0");
            } else {
                gammaRate.append("1");
            }
            ones = 0;
            zeros = 0;
        }

        //NOT operation to get inverse of gammaRate to calculate epsilon rate
        int i = ~Integer.parseInt(gammaRate.toString(), 2);
        String tmp = Integer.toBinaryString(i);
        String epsilonRate = tmp.substring(tmp.length()- gammaRate.length());

        return (Integer.valueOf(gammaRate.toString(), 2)) * Integer.valueOf(epsilonRate, 2);
    }

    public int partTwo() {
        return 0;
    }
}
