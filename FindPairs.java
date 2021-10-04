public class FindPairs {
    public static void findPairs(int[] array, int specifiedNum){
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length ; j++) {
                if (array[i] + array[j] == specifiedNum){
                    System.out.println("Pairs are = " +array[i]+" and "+array[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 6, 2, 8, 9};
        findPairs(array, 8);
    }
}
