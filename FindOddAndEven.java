public class FindOddAndEven {
    public static void findEvenAndOdd(int[] array) {
        for (int i = 0; i <array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Even = "+array[i]);
            } else System.out.println("Odd = "+array[i]);
        }
    }
    public static void main(String[] args) {
        int[] array = {5, 6, 7, 8, 9 ,1 , 0};
        findEvenAndOdd(array);

    }
}
