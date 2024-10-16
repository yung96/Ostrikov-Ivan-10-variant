import java.util.Arrays;
import java.util.Random;

public class lab2_var10_3 {

    public static void main(String[] args) {

        int rows = 5;
        int cols = 6;


        int[][] matrix = createRandomMatrix(rows, cols, -99, 99);


        System.out.println("Исходная матрица: ");
        printMatrix(matrix);

        int[] vectorB = countNumbers(matrix);


        System.out.println("Четных чисел в каждой строке: ");
        System.out.println(Arrays.toString(vectorB));
    }


    public static int[][] createRandomMatrix(int rows, int cols, int min, int max) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
        return matrix;
    }


    public static int[] countNumbers(int[][] matrix) {
        int[] vectorB = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    count++;
                }
            }
            vectorB[i] = count;
        }
        return vectorB;
    }


    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
