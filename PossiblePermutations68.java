public class PossiblePermutations68 {
    public static void printArray(int[] array) {
        System.out.println("\n");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "");
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void possiblePermutation(int[] array, int index) {
        if (index == array.length - 1) {
            printArray(array);
        }
        for (int i = index; i < array.length; i++) {
            swap(array, i, index);
            possiblePermutation(array, index + 1);
            swap(array, i, index);

        }
    }



    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        possiblePermutation(array, 0);
    }
}
