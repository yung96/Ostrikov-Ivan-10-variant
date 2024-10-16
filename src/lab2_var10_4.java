import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static java.lang.Math.*;

public class lab2_var10_4 {

    public static void main(String[] args) {

        int n = 4;

        int[][] A = createRandomMatrix(n, -50, 50);


        System.out.println("Исходная матрица:");
        printMatrix(A);


        double geometric = findGeometric(A);


        if (geometric > 0) {
            System.out.println("Среднее геометрическое: " + geometric);
        } else {
            System.out.println("Нет отрицательных элементов");
        }
    }


    public static int[][] createRandomMatrix(int n, int min, int max) {
        Random random = new Random();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
        return matrix;
    }


    public static double findGeometric(int[][] matrix) {
        List<Integer> negativeElements = new ArrayList<>();
        int n = matrix.length;
        double product = 1.0;


        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] < 0) {
                    negativeElements.add(matrix[i][j]);
                    product *= matrix[i][j];
                }
            }
        }


        if (!negativeElements.isEmpty()) {
            double nNegative = negativeElements.size();
            return pow(product, 1.0 / nNegative);
        } else {
            return -1;
        }
    }


    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%4d ", value);
            }
            System.out.println();
        }
    }
}
