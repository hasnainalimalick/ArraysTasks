public class MaximumDiff65 {
    public static void maximumDiff(int[] array){
        int difference;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                difference = array[j] - array[i];
                Math.abs(difference);
                if (difference > temp){
                    temp = difference;
                }
            }
        }
        System.out.println(temp);
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 1, 7, 9, 5, 11, 3, 5};
        maximumDiff(array);
    }
}
