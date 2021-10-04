public class FindMissingNumber {
    public static void missingNum(int[] array){
        int total = 7;
        int expectedSum = total * ((total +1)/2);
        int actualSum = 0;
        for (int e : array){
            actualSum += e;

        }
        System.out.println(expectedSum - actualSum);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 7};
        missingNum(array);
    }
}
