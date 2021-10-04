public class IfPairHas {
    public static void ifPair(int[] array, int num){
        boolean b = true;
        outer:
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int sum = array[i] + array[j];
                if (sum == num){
                    System.out.println("Array has Pair");
                    b = false;
                    break outer;


                }
            }
        }
        if (b)
            System.out.println("Array has no pair");
    }

    public static void main(String[] args) {
        int[] array = {5, 6, 8, 9, 2, 4};
        int num = 11;
        ifPair(array, num);
    }
}
