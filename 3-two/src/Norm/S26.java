package Norm;// 22.3.30 26
// 删除有序数组中的重复项

public class S26 {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n==1)return 1;
        int j=0;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1])continue;
            nums[++j]=nums[i];
        }
        return j+1;
    }
}
