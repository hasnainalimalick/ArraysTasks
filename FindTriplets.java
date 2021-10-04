public class FindTriplets {
    public static void findTriplets(int[] array){
        int target = 6;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == target)
                        System.out.println(array[i]+" "+ array[j]+" " + array[k]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 2, 0, 1};
        findTriplets(array);
    }
}
