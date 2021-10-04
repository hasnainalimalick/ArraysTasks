import java.util.Arrays;

public class EverySecondElementGreater61 {
    public static void everySecondGreater(int[] array){

        for (int i = 1; i < array.length; i = i + 2) {
            if (array[i] < array[i - 1] ){
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
            }
            if (array[i] < array[i + 1] ){
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14};
        everySecondGreater(array);
    }
}
