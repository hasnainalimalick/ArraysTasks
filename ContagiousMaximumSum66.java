public class ContagiousMaximumSum66 {
    public static void contagiousMaxSum(int[] array){
        int mEnding = 0;
        int mTillNow = Integer.min(-122333, -223);
        for (int i = 0; i < array.length; i++) {
            mEnding = mEnding + array[i];
            if (mEnding < array[i])
                mEnding = array[i];
            if (mTillNow < mEnding)
                mTillNow = mEnding;


        }
        System.out.println(mTillNow);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, -3, -4, 0, 6, 7, 8, 9};
        contagiousMaxSum(array);
    }
}
