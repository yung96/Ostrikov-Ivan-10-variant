import static java.lang.Math.*;
import java.util.Scanner;


public class Math3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();

        double y;
        if (x <= -3) {
            y = pow(x, 3) + 1;
        } else if (x > -3 && x <= 0) {
            y = 1 / (1 + pow(2, tan(x)));
        } else {
            y = 1 / pow(tan(x), 2);
        }

        double f;
        if (x <= -3) {
            f = exp(x + 1);
        } else if (x > -3 && x <= 0) {
            f = pow(x, 4);
        } else {
            f = pow(tan(x), 1.0 / 5.0);
        }

        System.out.println("y: " + y + " f: " + f);

    }
}
