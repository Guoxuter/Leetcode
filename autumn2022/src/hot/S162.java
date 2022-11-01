// 2022.11.01
package hot;

public class S162 {
    public int findPeakElement(int[] nums) {
        int l=0,r=nums.length-1;
        while(l<r&& l<nums.length-1){
            int mid=(l+r)>>1;

            if(nums[mid]<nums[mid+1])l=mid+1;
            else r=mid-1;
        }
        return l;
    }
}
