public class Lab4_3 {
    public static void main(String[] args) {
        // Создаем 2D точки
        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 8);

        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);

        System.out.println("Расстояние от p1 до начала координат: " + p1.distanceFromOrigin());

        // Проверяем, внутри ли точка p1 в прямоугольнике
        Point rectTopLeft = new Point(0, 10);
        Point rectBottomRight = new Point(5, 0);
        System.out.println("p1 внутри прямоугольника: " + p1.isInRectangle(rectTopLeft, rectBottomRight));

        // Проверяем, внутри ли точка p2 в круге
        Point circleCenter = new Point(0, 0);
        int radius = 10;
        System.out.println("p2 внутри круга: " + p2.isInCircle(circleCenter, radius));

        // Создаем 3D точку
        Point3D p3D1 = new Point3D(3, 4, 5);
        Point3D p3D2 = new Point3D(6, 8, 10);

        System.out.println("p3D1: " + p3D1);
        System.out.println("p3D2: " + p3D2);

        // Расстояние от p3D1 до начала координат
        System.out.println("Расстояние от p3D1 до начала координат: " + p3D1.distanceFromOrigin());

        // Проверяем, внутри ли точка p3D1 в прямоугольном параллелепипеде
        Point3D boxCorner1 = new Point3D(0, 0, 0);
        Point3D boxCorner2 = new Point3D(10, 10, 10);
        System.out.println("p3D1 внутри параллелепипеда: " + p3D1.isInBox(boxCorner1, boxCorner2));

        // Проверяем, внутри ли точка p3D2 в сфере
        Point3D sphereCenter = new Point3D(0, 0, 0);
        int sphereRadius = 15;
        System.out.println("p3D2 внутри сферы: " + p3D2.isInSphere(sphereCenter, sphereRadius));
    }
}
