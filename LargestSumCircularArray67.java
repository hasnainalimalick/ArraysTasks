public class LargestSumCircularArray67 {
    public static void contagiousMaxSum(int[] array){
        int mEnding = 0;
        int totalSum = 0;
        int mTillNow = Integer.min(-122333, -223);
        for (int i = 0; i < array.length; i++) {
            array[i] = -1 * array[i];
            mEnding = mEnding + array[i];
            if (mEnding < array[i])
                mEnding = array[i];
            if (mTillNow < mEnding)
                mTillNow = mEnding;


        }

        for (int i = 0; i < array.length; i++) {
            totalSum = totalSum + array[i];

        }
        System.out.println(totalSum + mTillNow);
    }

    public static void main(String[] args) {
        int[] array = {2, 1, -5, 4, -3, 1, -3, 4, -1};
        contagiousMaxSum(array);
    }
}
