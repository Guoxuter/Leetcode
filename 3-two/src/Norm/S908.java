package Norm;// 2022.4.30

// 最小差值 I

// 每日一题


import java.util.Arrays;

public class S908 {
    public int smallestRangeI(int[] nums, int k) {

        Arrays.sort(nums);
        int a=nums[nums.length-1],b=nums[0];
        if(a-b>2*k)return a-b-2*k;
        return 0;
    }
}
