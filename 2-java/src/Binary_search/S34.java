package Binary_search;

// 11.12 1
// 在排序数组中查找元素的第一个和最后一个位置
public class S34 {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1, -1};
        int n=nums.length;
        if (n == 0) return ans;

        int i=0,j=n-1;
        while(i<j){
            int mid=i+j>>1;
            if(nums[mid]>=target)j=mid;
            else i=mid+1;
        }

        if(nums[i]!=target)return ans;
        else{
            ans[0]=i;
            j=n-1;
            while(i<j){
                int mid=i+j+1>>1;
                if(nums[mid]<=target)i=mid;
                else j=mid-1;
            }
            ans[1]=j;
            return ans;
        }

    }
}
