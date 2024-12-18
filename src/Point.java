import static java.lang.Math.*;

public class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
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

    public int distanceFromOrigin() {

        return (int) sqrt(x * x + y * y);
    }

    public boolean isInRectangle(Point top_left, Point bottom_right) {
        return x >= top_left.getX() && x <= bottom_right.getX() && y <= top_left.getY() && y >= bottom_right.getY();
    }

    public boolean isInCircle(Point center, int radius) {
        int distanceSquared = (x - center.getX()) * (x - center.getX()) + (y - center.getY()) * (y - center.getY());
        return distanceSquared <= radius * radius;
    }
}


