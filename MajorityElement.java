public class MajorityElement {
    public static void majorityElement(int[] array){
        int majoritySize = array.length/2;
        int count = 0;
        int majorityElement ;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j])
                    count++;
            }

            if (count > majoritySize) {
                majorityElement = array[i];
                System.out.println(majorityElement);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 8, 8, 8, 8, 8, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6};
        majorityElement(array);
    }
}
