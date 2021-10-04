public class CheckSpecifiedElement {
    public static void specifiedElement(int[] array){
        boolean b1 = false;
        boolean b2 = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 77){
                b1 = true;
            }
            if (array[i] == 65){
                b2 = true;
            }
        }
        if (b1 && b2){
            System.out.println("Yes contains");

        }
    }

    public static void main(String[] args) {
        int[] array = {77, 65, 4};
        specifiedElement(array);
    }
}
