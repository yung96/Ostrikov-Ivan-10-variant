public class lab4_4 {
    public static void main(String[] args) {
        // Создаем точку 2D
        Point2 p1 = new Point2(3, 4);
        System.out.println("Точка p1: " + p1);

        // Прямая: 2x + 3y - 5 = 0
        int A = 2, B = 3, C = -5;
        System.out.println("Расстояние от p1 до прямой 2x + 3y - 5 = 0: " + p1.distanceFromLine(A, B, C));

        // Создаем точку 3D
        Point3D2 p2 = new Point3D2(3, 4, 5);
        System.out.println("Точка p2: " + p2);

        // Плоскость: x + 2y + 3z - 6 = 0
        int D = -6;
        System.out.println("Расстояние от p2 до плоскости x + 2y + 3z - 6 = 0: " + p2.distanceFromPlane(A, B, C, D));
    }
}
