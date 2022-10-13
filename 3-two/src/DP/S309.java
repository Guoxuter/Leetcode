// 2022.5.3

// 最佳买卖股票时机含冷冻期

// 动态规划

package DP;

public class S309 {
    public int maxProfit(int[] prices) {
        if(prices.length==0)return 0;
        // 手上不持有股票，冷冻期，手上持有股票 最大值
        int dp0=0,dp1=0,dp2=-prices[0];

        for(int x:prices){
            int temp=dp0;
            dp0=Math.max(dp0,dp1);
            dp1=dp2+x;
            dp2=Math.max(dp2,temp-x);
        }
        return Math.max(dp0,dp1);
    }
}
