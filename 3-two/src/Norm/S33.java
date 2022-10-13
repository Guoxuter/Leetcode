package Norm;// 22.4.9 33
// 搜索旋转排序数组

public class S33 {
    public int search(int[] nums, int target) {
        int ans=-1;
        if(nums.length==0)return ans;
        int l=0,r=nums.length-1;

        while(l<r){
            int m=(l+r+1)/2;
            if(nums[m]>=nums[0])
                l=m;

            else
                r=m;
        }

        if(target>=nums[0])
            l=0;
        else{
            l=l+1;
            r=nums.length-1;
        }

        while(l<r){
            int m=l+r>>1;
            if(nums[m]>=target)r=m;
            else l=m+1;
        }
        if(nums[l]==target)ans=l;
        return ans;



    }
}
