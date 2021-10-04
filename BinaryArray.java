import java.util.*;
public class BinaryArray {
    public static void putAllZero(int[] array){
        int j = 0;
        for (int i = 0; i < array.length;) {
            if (array[i] == 1){
                i++;
            }
            else {
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                i++;
                j++;
            }

        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 0, 1, 0, 1};
        putAllZero(array);
    }

}
