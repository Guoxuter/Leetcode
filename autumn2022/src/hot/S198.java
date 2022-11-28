// 2022.11.28
package hot;

public class S198 {
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        int dp1=nums[0],dp2=Math.max(dp1,nums[1]);
        for(int i=2;i<nums.length;i++){

            int cur=Math.max(dp1+nums[i],dp2);
            dp1=dp2;
            dp2=cur;
        }
        return dp2;
    }
}
