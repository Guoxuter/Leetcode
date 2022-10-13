// 2022.4.30
// 乘积最大子数组
// 动态规划


package DP;

public class S152 {
    public int maxProduct(int[] nums) {
        int ans=nums[0],curmax=1,curmin=1,n=nums.length;
        if(n==1)return nums[0];
        for(int x:nums){
            int cm=curmax;
            // 考虑前一个最小的乘积（可能为负数）与当前负数相乘可能会更大
            curmax=Math.max(curmin*x,Math.max(curmax*x,x));
            curmin=Math.min(cm*x,Math.min(curmin*x,x));
            ans=Math.max(ans,curmax);
        }
        return ans;
    }
}
