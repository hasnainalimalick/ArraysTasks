import java.util.ArrayList;

public class ConvertArrayListToArray {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(3);
        al.add(3);

        Integer[] array = new Integer[al.size()];
        al.toArray(array);
        for(int e: array)
        System.out.println(e);
    }
}
