// 2022.5.2

// 买卖股票的最佳时机 II

// 动态规划

package DP;

public class S122 {
    public int maxProfit(int[] prices) {
        int dp0=0,dp1=-prices[0];
        for (int x : prices) {
            int temp=dp0;
            // 买卖股票后，状态会发生改变，
            // 因此用两个变量分别记录
            dp0=Math.max(dp0,dp1+x);
            dp1=Math.max(dp1,dp0-x);

        }
        return dp0;
    }
}
