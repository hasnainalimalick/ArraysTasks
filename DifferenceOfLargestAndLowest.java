public class DifferenceOfLargestAndLowest {
    public static void difference(int[] array){
        int largest = array[0];
        int lowest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest){
                largest = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < lowest){
                lowest = array[i];
            }
        }
        int d = largest - lowest;
        System.out.println("Difference between lowest and largest is= "+d);

    }
    public static void main(String[] args) {
        int[] array = {4, 6, 7, 8, 9, 1, 3};
        difference(array);

    }
}
