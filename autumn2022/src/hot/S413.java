// 2022.10.30
package hot;

public class S413 {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3)return 0;
        int l=0;
        int r=1;
        int ans=0;
        int dist=nums[1]-nums[0];
        while(r<nums.length){
            if(dist!=nums[r]-nums[r-1]){
                if(r-l>2){
                    ans+=(r-l-2)*(r-l-1)/2;
                }
                l=r-1;
                dist=nums[r]-nums[l];
            }
            r++;
        }
        // l=r-1时后项为0
        ans+=(r-l-2)*(r-l-1)/2;
        return ans;
    }
}
