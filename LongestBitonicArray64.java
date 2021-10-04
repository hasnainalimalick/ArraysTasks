public class LongestBitonicArray64 {
    public static void bitonicArray(int[] array) {
        int i;
        for (i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1])
                continue;
            if (array[i] <= array[i - 1]) {
                System.out.println(array[i]);
                break;
            }
        }

        for (int j = i + 1; j < array.length ; j++) {
            if (array[j] < array[j - 1])
                continue;
            if (array[j] >= array[j - 1]) {
                System.out.println(array[i]);
                break;
            }
        }


    }




    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        bitonicArray(array);
    }
}
