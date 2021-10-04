import java.util.Arrays;
public class LargestElement {
    public static void main(String[] args) {
        int[] my_array = {
                3, 4, 5};
        System.out.println("Original numeric array : "+Arrays.toString(my_array));
        Arrays.sort(my_array);
        int index = my_array.length-1;
        System.out.println(index);
        while(my_array[index]==my_array[my_array.length-1]){
            System.out.println("hasnain");

            index--;
        }
        System.out.println("Second largest value: " + my_array[index]);
        System.out.println(index);
    }
}