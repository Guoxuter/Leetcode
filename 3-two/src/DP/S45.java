// 2022.4.28
// 跳跃游戏II

package DP;

public class S45 {

    public int jump(int[] nums) {
        int ans=0,end=0;
        int rightmost=0;


        for(int i=0;i<nums.length-1;i++){ // n-1的目的是刚好走到到
            // 最后一步的时候不多加一步

            // 当前如果走这一步的话，能走到的最远距离
            rightmost=Math.max(rightmost,i+nums[i]);

            // 决定走下一步
            if(i==end){
                ans++;
                end=rightmost;
            }
        }
        return ans;
    }
}
