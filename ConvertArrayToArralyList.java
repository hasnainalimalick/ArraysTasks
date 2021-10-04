import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArralyList {
    public static void main(String[] args) {
        Integer[]  my_array = {3, 4, 5, 7};
        ArrayList  list = new ArrayList(Arrays.asList(my_array));

        System.out.println(list);
    }
}
