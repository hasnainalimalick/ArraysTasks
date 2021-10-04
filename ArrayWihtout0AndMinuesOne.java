public class ArrayWihtout0AndMinuesOne {
    public static void withoutZeroMinus(int[] array){
        boolean b = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0 || array[i] == -1){
                b = true;
            }
        }
        if (b == true){
            System.out.println("Yes array contains ");
        }else System.out.println("not");
    }
    public static void main(String[] args) {
        int[] array = {4, 6, 7, 8, 0};
        withoutZeroMinus(array);

    }
}
