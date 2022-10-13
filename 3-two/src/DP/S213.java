// 2022.4/27
// 打家劫舍II

package DP;

import java.util.Arrays;

public class S213 {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        else if (n == 2) return Math.max(nums[0], nums[1]);

        // 输出 可以偷第一间房子 和 不偷第一间房子的最大值
        return Math.max(
                robRange(Arrays.copyOfRange(nums, 0, nums.length - 1)),
                robRange(Arrays.copyOfRange(nums, 1, nums.length))
        );
    }

    public int robRange(int[] nums) {
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
