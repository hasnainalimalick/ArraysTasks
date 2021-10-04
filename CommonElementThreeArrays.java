public class CommonElementThreeArrays {
    public static void commonElementInArrays(int[] array1, int[] array2, int[] array3){
        int i, j, k;
        for ( i = 0; i < array1.length; i++) {

            for ( j = 0; j < array2.length; j++) {

                for (k = 0; k < array3.length; k++) {
                if (array1[i] == array2[j] && array2[j] == array3[k]) {
                    System.out.println(array1[i]);
                }
            }

            }
        }
    }

    public static void main(String[] args) {
        int[] array1 = {3, 5, 4, 7};
        int[] array2 = {3, 5, 6, 7};
        int[] array3 = {3, 5, 6};
        commonElementInArrays(array1, array2, array3);
    }
}
