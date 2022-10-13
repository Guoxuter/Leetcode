package Norm;// 2022.4.28
// 按奇偶排序数组
// 每日一题

import java.util.Arrays;

public class S905 {
    public int[] sortArrayByParity(int[] nums) {
        int n= nums.length;
        if(n==1)return nums;
        int i=0,j=n-1;
        while(i<j){

            // 如果是奇数，则放到最后去
            // i不加，是因为换过来的数也可能是偶数
            if(nums[i]%2!=0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j--;
            }
            else i++;
        }
        return nums;
    }
}
