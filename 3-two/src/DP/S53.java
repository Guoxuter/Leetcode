// 2022.4.29
// 最大子数组和
// 动态规划

package DP;

public class S53 {
    public int maxSubArray(int[] nums) {
        int pre=0,ans=nums[0];
        for(int x:nums){
            // pre是以当前数字结尾的子数组的最大值
            pre=Math.max(pre+x,x);
            ans=Math.max(pre,ans);
        }
        return ans;
    }
}
