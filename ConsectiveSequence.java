public class ConsectiveSequence {
    public static void sequence(int[] array){
        int num = 0;
        int counter = 1;
        for (int i = 0; i < array.length; i++) {
            num = array[i];
            num++;
            for (int j = 0; j < array.length; j++) {
                System.out.println();
                if (array[j] == num){
                    counter++;
                }

            }
        }
        System.out.println("Length of array"+counter);
    }

    public static void main(String[] args) {
        int[] array = {49, 1, 3, 200, 2, 4, 70, 5};
        sequence(array);

    }
}
