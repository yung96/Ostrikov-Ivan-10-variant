import static java.lang.Math.*;
import java.util.Scanner;


public class Math {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, d;

        a = sc.nextDouble();
        b = sc.nextDouble();

        System.out.println(max(a, b));

        d = cos(max(a, b));

        System.out.println(d);


    }
}
