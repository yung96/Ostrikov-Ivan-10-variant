public class lab4_2 {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(3.0, 4.0);
        ComplexNumber num2 = new ComplexNumber(3.0, 4.0);
        ComplexNumber num3 = new ComplexNumber(5.0, -2.0);

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("num3: " + num3);

        System.out.println("num1 равен num2? " + num1.equals(num2)); // true
        System.out.println("num1 равен num3? " + num1.equals(num3)); // false
    }
}
