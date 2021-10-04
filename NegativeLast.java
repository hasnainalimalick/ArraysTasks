import java.util.Arrays;

public class NegativeLast {
    public static void negativeLast(int[] array){
        int j = array.length-1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0){
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                i--;
                j--;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {6, 7, -2, 6, -5, -7, 6, -4};
        negativeLast(array);
    }
}
