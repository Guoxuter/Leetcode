package Binary_search;

// 11.15 1
// 搜索插入位置
public class S35 {
    public int searchInsert(int[] nums, int target) {
        int i=0,j=nums.length-1;
        while(i<j){
            int mid=i+j>>1;
            if(nums[mid]<target)i=mid+1;
            else j=mid;
        }
        return nums[i]==target? i:i+1;
    }
}
