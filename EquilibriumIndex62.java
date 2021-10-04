public class EquilibriumIndex62 {
    public static void equilibriumIndex(int[] array) {
        int rightSideSum = 0;
        int leftSideSum = 0;
        boolean b = true;
        int i;
        for (i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                rightSideSum = rightSideSum + array[j];

            }
            for (int k = array.length - 1; k > i; k--) {
                leftSideSum = leftSideSum + array[k];
            }
            if (rightSideSum == leftSideSum){
                System.out.println(i);
            }
            else if (rightSideSum != leftSideSum){
                rightSideSum = 0;
                leftSideSum = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = { 5, 5, 3, 2, 2, 2, 2, 2};
        equilibriumIndex(array);
    }
}
