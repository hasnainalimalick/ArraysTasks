import java.util.Arrays;

public class MaximumAndMin {

    public static int maximumNo(int[] array){
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
            max = array[i];
        }
        return max;
    }

    public static int minimumNo(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }









    public static void main(String[] args) {
        int[] array = {0, 5, 6, 7, 8};
        System.out.println(maximumNo(array));
        System.out.println(minimumNo(array));
    }
}
