import static java.lang.Math.*;

public class Point2 {
    private int x;
    private int y;

    public Point2() {
        this.x = 0;
        this.y = 0;
    }

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Метод для вычисления расстояния от точки до прямой Ax + By + C = 0
    public double distanceFromLine(int A, int B, int C) {
        return abs(A * x + B * y + C) / sqrt(A * A + B * B);
    }
}

