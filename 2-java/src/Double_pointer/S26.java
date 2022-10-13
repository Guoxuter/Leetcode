package Double_pointer;

// 11.7 5
// 删除有序数组中的重复项
public class S26 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=nums[j])nums[++j]=nums[i];
        }
        return j;
    }

}
