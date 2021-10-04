public class ConsecutiveNos {
    public static void consecutiveArray(int[] array){
        int[] copyArray = array.clone();
            for (int j = 0; j < array.length -1 ; j++) {
                int temp = array[j + 1];
                if (array[j] + 1 == temp) {
                    System.out.println(copyArray[j]);
                }
            }
        }

    public static void main(String[] args) {
        int[] array = {66, 77, 88, 1, 2, 3, 4, 5};
        consecutiveArray(array);
    }
}
