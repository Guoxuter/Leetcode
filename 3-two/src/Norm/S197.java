package Norm;// 2022.4.20
// 最大数

import java.util.Arrays;

public class S197 {
    public static String largestNumber(int[] nums) {
        int n = nums.length;
        String[] ss = new String[n];
        for (int i = 0; i < n; i++) ss[i] = "" + nums[i];

        Arrays.sort(ss, (a, b) -> {
            String sa = a + b, sb = b + a;
            return sa.compareTo(sb);
        });
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            sb.append(ss[i]);
        }
        int k=0;
        while(k<sb.length()-1 ){
            if(sb.charAt(k)=='0')k++;
            else break;
        }
        return sb.substring(k,sb.length());
    }

    public static void main(String[] args) {
        int[] n = {0,0,0};
        System.out.println(largestNumber(n));
    }
}
