import java.util.Arrays;

public class DuplicateVlues {
    public static void duplicateValues(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            for (int j = i + 1; j < arrays.length ; j++) {
                if (arrays[j] == arrays[i]){
                    System.out.println(arrays[j]);
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 2, 2, 3, 3, 3, 4, 2, 2, 4, 4, 5};
        duplicateValues(array);

    }
}
