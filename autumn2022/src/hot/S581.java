// 2022.11.24
package hot;

public class S581 {
    public int findUnsortedSubarray(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        int min=nums[n-1];
        int l=-1,r=-1;
        for(int i=0;i<n;i++){
            if(max>nums[i])r=i;
            else max=nums[i];
            if(min<nums[n-i-1])l=n-i-1;
            else min=nums[n-i-1];
        }
        if(r==-1)return 0;
        return r-l+1;
    }
}
