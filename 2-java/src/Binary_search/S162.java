package Binary_search;

// 11.12 2
// 寻找峰值
public class S162 {
    public int findPeakElement(int[] nums) {
        int i=0,j=nums.length-1,ans=0;
        if(j==0)return 0;

        while(i<j){
            int mid=i+j>>1;
            if(nums[mid]>nums[mid+1])j=mid;
            else i=mid+1;
        }

        return i;

    }
}
