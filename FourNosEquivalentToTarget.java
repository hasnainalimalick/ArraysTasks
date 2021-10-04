public class FourNosEquivalentToTarget {
    public static void fourNosEquivalent(int[] array){
        int target = 63;
        for (int i = 0; i < array.length - 3; i++) {
            for (int j = i + 1; j < array.length - 2; j++) {
                for (int k = j + 1; k < array.length - 1; k++) {
                    for (int l = k + 1; l < array.length; l++) {
                        if (array[i] + array[j] + array[k] + array[l] == target)
                            System.out.println(array[i] +" "+ array[j] +" "+ array[k] +" "+ array[l]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 1, 2};;
        fourNosEquivalent(array);
    }
}
