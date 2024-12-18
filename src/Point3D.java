import static java.lang.Math.*;

public class Point3D extends Point {
    private int z;

    public Point3D() {
        super();  // вызывает конструктор родительского класса (Point), который инициализирует x и y
        this.z = 0;
    }

    public Point3D(int x, int y, int z) {
        super(x, y);  // вызывает конструктор родительского класса (Point) с x и y
        this.z = z;
    }

    public void setLocation(int x, int y, int z) {
        super.setLocation(x, y);  // устанавливает координаты x и y через метод родительского класса
        this.z = z;
    }

    // Перегрузка setLocation для случая без координаты z
    public void setLocation(int x, int y) {
        super.setLocation(x, y);  // устанавливает x и y
        this.z = 0;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }

    @Override
    public int distanceFromOrigin() {
        return (int) sqrt(getX() * getX() + getY() * getY() + z * z);
    }

    public boolean isInBox(Point3D corner1, Point3D corner2) {
        return getX() >= corner1.getX() && getX() <= corner2.getX() &&
                getY() >= corner1.getY() && getY() <= corner2.getY() &&
                z >= corner1.getZ() && z <= corner2.getZ();
    }

    public boolean isInSphere(Point3D center, int radius) {
        int distanceSquared = (getX() - center.getX()) * (getX() - center.getX()) +
                (getY() - center.getY()) * (getY() - center.getY()) +
                (z - center.getZ()) * (z - center.getZ());
        return distanceSquared <= radius * radius;
    }
}
