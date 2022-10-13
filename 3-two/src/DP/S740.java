// 2022.4/27
// 删除并获得点数

package DP;

import java.util.Arrays;

public class S740 {
    public int deleteAndEarn(int[] nums) {
        int m = 0;

        // 找到最大的数，以便于创建新数组
        for (int val : nums) {
            m = Math.max(m, val);
        }

        // 创建新数组，每个元素相当于选择某一数字的收益
        int[] sum = new int[m+ 1];
        for (int val : nums) {
            sum[val] += val;
        }

        return rob(sum);
    }



    public int rob(int[] nums) {
        int n=nums.length;
        if(n<2)return Math.max(nums[0],nums[1]);
        int dp0=nums[0],dp1=Math.max(nums[0],nums[1]);

        for(int i=2;i<n;i++){
            int temp = dp1;
            dp1=Math.max(dp0+nums[i],dp1);
            dp0=temp;
        }
        return dp1;
    }
}
