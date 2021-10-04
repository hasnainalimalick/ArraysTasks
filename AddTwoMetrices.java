import java.util.Scanner;

public class AddTwoMetrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input no of rows");
        int m = sc.nextByte();
        System.out.println("Input no of columns");
        int n = sc.nextByte();
        int[][] array1 = new int[m][n];
        int[][] array2 = new int[m][n];
        int[][] sum = new int[m][n];
        System.out.println("input no of first matrix");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                array1[i][j] = sc.nextInt();

        System.out.println("input no of second matrix");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                array2[i][j] = sc.nextInt();

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                sum[i][j] = array1[i][j] + array2[i][j];
        System.out.println("sum of metrices");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                System.out.println(sum[i][j]);
        System.out.println();



    }
}
