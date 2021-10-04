public class CommonElement {
    public static void commonElement(int[] array1, int[]array2){
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]){
                System.out.println(array1[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] array1 = {3, 5, 6, 7};
        int[] array2 = {3, 5, 9, 7};
        commonElement(array1, array2);
    }
}
