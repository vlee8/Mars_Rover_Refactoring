package rover;

import java.util.Arrays;
import java.util.List;

public class MarsRover {
    private static final List<String> VALID_COMMANDS = Arrays.asList("L", "R", "M");


    private Direction direction;
    private Position position;
    private int LEFT = 3;
    private int RIGHT = 1;


    public MarsRover(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }

    public String run(String input) {
        String[] commands = convertInputIntoCommands(input);

        for (String command : commands) {
            if (command.equals("M")) {
                direction.move(position);
            } else if (command.equals("R")) {
                this.direction = direction.turn(RIGHT);
            } else if (command.equals("L")) {
                this.direction = direction.turn(LEFT);
            }
        }

        return asString();
    }


    private String asString() {
        return position.getX() + " " + position.getY() + " " + direction;
    }

    private static String[] convertInputIntoCommands(String input) {
        String[] commandArray = input.split("(?!^)");

        validateCommands(input, commandArray);

        return commandArray;
    }

    private static void validateCommands(String input, String[] commandArray) {
        for (String command : commandArray) {
            if (!VALID_COMMANDS.contains(command)) {
                throw new IllegalArgumentException("Invalid command sequence: " + input);
            }
        }
    }


}
