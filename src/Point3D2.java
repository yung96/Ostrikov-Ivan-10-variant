import static java.lang.Math.*;

public class Point3D2 extends Point2 {
    private int z;

    public Point3D2() {
        super();  // вызывает конструктор родительского класса (Point), который инициализирует x и y
        this.z = 0;
    }

    public Point3D2(int x, int y, int z) {
        super(x, y);  // вызывает конструктор родительского класса (Point) с x и y
        this.z = z;
    }

    public void setLocation(int x, int y, int z) {
        super.setLocation(x, y);  // устанавливает координаты x и y через метод родительского класса
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }

    // Метод для вычисления расстояния от точки до плоскости Ax + By + Cz + D = 0
    public double distanceFromPlane(int A, int B, int C, int D) {
        return abs(A * getX() + B * getY() + C * z + D) / sqrt(A * A + B * B + C * C);
    }
}
