// 2022.11.28
package hot;

public class S152 {
    public int maxProduct(int[] nums) {
        int dpmax=nums[0],dpmin=nums[0];
        int ans=nums[0];

        for(int i=1;i<nums.length;i++){
            int mx = dpmax, mn = dpmin;
            dpmax=Math.max(mx*nums[i],nums[i]);
            dpmax=Math.max(dpmax,mn*nums[i]);

            dpmin=Math.min(mn*nums[i],nums[i]);
            dpmin=Math.min(dpmin,mx*nums[i]);

            ans=Math.max(dpmax,ans);

        }
        return ans;
    }
}
