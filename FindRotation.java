public class FindRotation {
    public static void findRotation(int[] array){
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
                index = i;
            }
        }
        System.out.println(index);
    }

    public static void main(String[] args) {
        int[] array = {35, 32, 30, 14, 18, 21, 27};
        findRotation(array);
    }
}
