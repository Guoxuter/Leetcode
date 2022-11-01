// 2022.10.31
package hot;

public class S33 {
    public int search(int[] nums, int target) {
        if(nums.length==0)return -1;
        if(nums.length==1)return nums[0]==target ? 0:-1;

        int l=0,r=nums.length-1;
        while (l <= r) {
            int mid=(l+r)/2;
            if(nums[mid]==target)return mid;
            if(nums[0]<=nums[mid]){
                if(nums[0]<=target && target<nums[mid]){
                    r=mid-1;
                }
                else l=mid+1;
            }
            else{
                if(nums[nums.length-1]>=target && nums[mid]<=target){
                    l=mid+1;
                }
                else r=mid-1;
            }
        }
        return -1;
    }
}
