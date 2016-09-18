package rover;

public class Position {
    private int X;
    private int Y;

    public Position(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public void updateX(int x) {
        X += x;
    }

    public void updateY(int y) {
        Y += y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }
}
