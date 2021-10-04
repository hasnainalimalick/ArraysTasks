import java.util.ArrayList;
import java.util.Arrays;

public class LargestNoOfArray71 {
    public static void largestArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i]);
        }
    }

        public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        largestArray(array);
    }
}
