package rover;

import java.util.Arrays;
import java.util.List;

public enum Direction {
    N, E, S, W;

    private static final List<Direction> DIRECTIONS = Arrays.asList(N, E, S, W);

    private int MOVE_POSITIVE = 1;
    private int MOVE_NEGATIVE = -1;

    public Direction turn(int leftOrRight) {
        return DIRECTIONS.get((DIRECTIONS.indexOf(this) + leftOrRight) % DIRECTIONS.size());
    }

    public void move(Position position) {
        if (this.equals(Direction.N)) {
            position.updateY(MOVE_POSITIVE);
        } else if (this.equals(Direction.S)) {
            position.updateY(MOVE_NEGATIVE);
        } else if (this.equals(Direction.E)) {
            position.updateX(MOVE_POSITIVE);
        } else if (this.equals(Direction.W)) {
            position.updateX(MOVE_NEGATIVE);
        }
    }

}
