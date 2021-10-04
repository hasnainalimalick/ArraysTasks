public class AverageValueExceptLargestAndLowest {
    public static void averageValue(int[] array){
        int largest = array[0];
        int lowest = array[0];
        int totalNoOfElements = array.length-2;
        float sumOfAllElements  = 0f;
        float average;
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
        for (int i = 0; i < array.length; i++) {
            sumOfAllElements = sumOfAllElements + array[i];
        }
        sumOfAllElements = sumOfAllElements - (largest + lowest);
        average = sumOfAllElements/totalNoOfElements;
        System.out.println(average);
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 4, 5};
        averageValue(array);
        
    }
}
