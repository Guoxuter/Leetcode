// 2022.4.29
// 环形子数组的最大和
// 动态规划


package DP;

public class S918 {
    public int maxSubarraySumCircular(int[] nums) {
        int preMax=0,preMin=0,MaxVal=nums[0],MinVal=nums[0];
        int sum=0;

        // 分别计算最大子数组 和最小子数组
        // 统计数组的和
        for(int x:nums){
            preMax=Math.max(preMax+x,x);
            preMin=Math.min(preMin+x,x);
            MaxVal=Math.max(preMax,MaxVal);
            MinVal=Math.min(preMin,MinVal);
            sum+=x;
        }

        // 最大值在两边的情况下，sum-MinVal为最大环装子数组
        // 要排除最大值为负数时，相减导致的子数组为空，值为0的情况
        return MaxVal>0?Math.max(MaxVal,sum-MinVal):MaxVal;

    }
}
