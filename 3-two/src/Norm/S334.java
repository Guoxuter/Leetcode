package Norm;// 2022.4.20
// 递增的三元子序列

import java.util.Arrays;

public class S334 {
    public static boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        if (n < 3) return false;
        long[] f = new long[3];
        Arrays.fill(f, (int) 1e19);
        for (int i = 0; i < n; i++) {
            int t = nums[i];
            System.out.println(f[1]+"_"+f[2]+"_"+t);
            if (f[2] < t) return true;
            else if (f[1] < t && t < f[2]) {
                f[2] = t;

            } else if (f[1] > t) f[1] = t;
        }
        return false;
    }
    public static void main(String[] args){
        int[] n= {2,3,1,4,2,4};

        System.out.println(increasingTriplet(n));
    }

}
