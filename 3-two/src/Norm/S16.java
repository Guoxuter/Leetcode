package Norm;// 22.3.28 16
// 最接近的三数之和

import java.util.Arrays;

public class S16 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1])continue;
            int j=i+1,k=nums.length-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(sum - target) < Math.abs(ans - target)) ans = sum;
                if(sum>target)k--;
                if(sum<target)j++;
                if(sum==target)return ans;
            }
        }
        return ans;
    }
}
