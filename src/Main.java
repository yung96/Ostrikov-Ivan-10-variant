import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x, y;

        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x < y) {
            x = x/2;
            System.out.println(x);
        } else {
            y = y/2;
            System.out.println(y);
        }






    }
}
