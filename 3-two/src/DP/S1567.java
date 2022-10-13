// 2022.4.30

// 乘积为正数的最长子数组长度
// 动态规划

package DP;

public class S1567 {
    public static int getMaxLen(int[] nums) {
        int ans = 0, curp = 0, curn = 0;
        for (int x : nums) {
            if (x > 0) {
                // 当前x为正，正负都直接加，除了curn为0的情况
                curp += 1;
                if(curn>0)  curn += 1;
            } else if (x < 0) {
                // 当前x为负，正负将转变
                int temp = curp;
                if(curn>0)
                    curp = curn + 1;
                else curp=0;
                curn = temp + 1;
            } else {
                // 当前为0，重置
                curp = 0;
                curn = 0;
            }
            // 记录最大长度
            ans = Math.max(ans, curp);
        }

        return ans;
    }

    public static void main(String[] args){
        int[] nums={1,2,3,5,-6,4,0,10};
        getMaxLen(nums);
    }
}
