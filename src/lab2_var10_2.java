import java.util.Arrays;

public class lab2_var10_2 {

    public static void main(String[] args) {

        int[] c = {0, 3, -2, 0, 5, 4, 0, -1};


        int[] x = getArray(c);


        System.out.println("Массив x до сортировки: " + Arrays.toString(x));


        selectionSort(x);


        System.out.println("Массив x после сортировки: " + Arrays.toString(x));
    }


    public static int[] getArray(int[] array) {

        int nonZeroCount = 0;
        for (int value : array) {
            if (value != 0) {
                nonZeroCount++;
            }
        }


        int[] result = new int[nonZeroCount];
        int index = 0;


        for (int value : array) {
            if (value != 0) {
                result[index++] = value * value;
            }
        }

        return result;
    }


    public static void selectionSort(int[] array) {
        int n = array.length;


        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }


            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
