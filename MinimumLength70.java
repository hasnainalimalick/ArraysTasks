public class MinimumLength70 {
    public static void contagiousMaxSum(int[] array){
        int mEnding = 0;
        int totalSum = 0;
        int mTillNow = 8;
        for (int i = 0; i < array.length; i++) {
            mEnding = mEnding + array[i];
            if (mEnding < array[i]) {
                System.out.println(array[i]);
                mEnding = array[i];
            }
            if (mTillNow >= mEnding) {
                System.out.println(array[i]);
                mTillNow = mEnding;
            }
        }

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6};
        contagiousMaxSum(array);
    }
}
