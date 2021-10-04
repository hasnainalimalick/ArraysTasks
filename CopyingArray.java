import java.util.Arrays;

public class CopyingArray {
    public static void copying(int[] array, int[] array2){
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];

        }
        System.out.println(Arrays.toString(array2));
    }


    public static void main(String[] args) {
        int[] array = {3, 6, 7, 8};
        int[] copied = new int[array.length];
        copying(array, copied);

    }
}
