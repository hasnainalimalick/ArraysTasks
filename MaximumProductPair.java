public class MaximumProductPair {
    public static void maximumProduct(int[] array){
        int sum = 0;
        int index1 = 0;
        int index2 = 0;
        int temp = array[0]*array[0];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                sum = array[i] * array[j];
                if (sum > temp ){
                    temp = sum;
                    index1 = i;
                    index2 = j;

                }
            }

        }
        System.out.println(array[index1]+" "+array[index2]);
    }

    public static void main(String[] args) {
        int[] array = { 2, 3, 5, 7, -7, 5, 8, -5 };
        maximumProduct(array);
    }
}
