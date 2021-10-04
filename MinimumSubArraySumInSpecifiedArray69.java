import java.util.Arrays;

public class MinimumSubArraySumInSpecifiedArray69 {
    public static void contagiousMaxSum(int[] array, int size) {
        Arrays.sort(array);
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);

    }


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        contagiousMaxSum(array, 4);
    }
}
