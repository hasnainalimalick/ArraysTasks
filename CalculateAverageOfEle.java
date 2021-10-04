import java.util.Arrays;

public class CalculateAverageOfEle {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 9, 1};
        double NoOfEle = array.length-1;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        System.out.println("Average is = "+(sum/NoOfEle));

    }
}
