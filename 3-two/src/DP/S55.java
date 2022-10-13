// 2022.4.28
// 跳跃游戏

package DP;

public class S55 {
    public boolean canJump(int[] nums) {
        int rightmost=0;
        for(int i=0;i<nums.length;i++){
            // 用最大可以到达的位置作为每一次的状态进行转移
            if(rightmost>=i){
                rightmost=Math.max(rightmost,i+nums[i]);
            }
            if(rightmost>=nums.length-1)return true;
        }
        return false;
    }
}
