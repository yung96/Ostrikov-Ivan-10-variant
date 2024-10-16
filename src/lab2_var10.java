import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class lab2_var10 {

    public static void main(String[] args) {

        int[] array = createRandomArray(20, -99, 99);


        System.out.println("Исходный массив: " + Arrays.toString(array));


        double[] reciprocalArray = createReciprocalFraction(array);


        System.out.println("Массив обратных дробей: " + Arrays.toString(reciprocalArray));


        int[] duplicates = findDuplicates(array);
        System.out.println("Повторяющиеся элементы: " + Arrays.toString(duplicates));
    }


    public static int[] createRandomArray(int size, int min, int max) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }


    public static double[] createReciprocalFraction(int[] array) {
        double[] reciprocalArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            try {
                reciprocalArray[i] = 1.0 / array[i];
            } catch (ArithmeticException e) {
                reciprocalArray[i] = 0;
            }
        }
        return reciprocalArray;
    }


    public static int[] findDuplicates(int[] array) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int value : array) {
            if (!seen.add(value)) {
                duplicates.add(value);
            }
        }
        int[] result = new int[duplicates.size()];
        int index = 0;
        for (int value : duplicates) {
            result[index++] = value;
        }
        return result;
    }
}
