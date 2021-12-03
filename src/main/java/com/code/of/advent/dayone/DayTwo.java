package com.code.of.advent.dayone;

import java.util.List;

public class DayTwo {

    private final List<Command> commands;

    public DayTwo(List<Command> commands) {
        this.commands = commands;
    }

    public int partOne() {
        int horizontalPos = 0;
        int depth = 0;
        for (Command c : commands) {
            switch (c.getDirection()) {
                case "forward":
                    horizontalPos += c.getAmount();
                    break;
                case "up":
                    depth -= c.getAmount();
                    break;
                case "down":
                    depth += c.getAmount();
                    break;
                default:
                    throw new RuntimeException("Direction not recognised");
            }
        }
        return horizontalPos * depth;
    }

    public int partTwo() {
        int horizontalPos = 0;
        int depth = 0;
        int aim = 0;
        for (Command c : commands) {
            switch (c.getDirection()) {
                case "forward":
                    horizontalPos += c.getAmount();
                    depth += aim * c.getAmount();
                    break;
                case "up":
                    aim -= c.getAmount();
                    break;
                case "down":
                    aim += c.getAmount();
                    break;
                default:
                    throw new RuntimeException("Direction not recognised");
            }
        }
        return horizontalPos * depth;
    }

    static class Command {
        private final String direction;
        private final int amount;

        public Command(String direction, int amount) {
            this.direction = direction;
            this.amount = amount;
        }

        public String getDirection() {
            return direction;
        }

        public int getAmount() {
            return amount;
        }
    }
}
