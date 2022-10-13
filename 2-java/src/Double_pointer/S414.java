package Double_pointer;

// 11.6 2
// 第三大的数
public class S414 {
    public int thirdMax(int[] nums) {
        // max, second max, thirdmax
        long m =(long) Integer.MIN_VALUE-1, s = m, t = m;
        int tag=0;

        for (int x : nums) {
            if (x > m) {
                t = s;
                s = m;
                m = x;
            } else if (x < m && x > s) {
                t = s;
                s = x;
            } else if (x < s && x >= t) {
                t = x;
            }
        }
        return t==(long)Integer.MIN_VALUE-1? (int)m : (int)t;

    }
}
