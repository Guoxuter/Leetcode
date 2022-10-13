package Norm;// 22.3.27 15
// 三数之和


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>0)break;
            // 用来确保没有重复的组
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int s=i+1,e=n-1;
            while(s<e){
                // 用来确保没有重复数组
                while (s > i + 1 && s < n && nums[s] == nums[s - 1]) s++;
                if (s >= e) break;
                int sum = nums[i] + nums[s] + nums[e];
                if(sum>0)e--;
                else if(sum<0)s++;
                else{
                    ans.add(Arrays.asList(nums[i], nums[s], nums[e]));
                    e--;
                }

            }
        }
        return ans;
    }
}
