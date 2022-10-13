// 2022.5.3

// 最佳买卖股票时机含手续费

// 动态规划

package DP;

public class S714 {
    public int maxProfit(int[] prices, int fee) {
        if(prices.length==0)return 0;

        int dp0=0,dp1=-prices[0];

        for(int i=1;i<prices.length;i++){
            int temp=dp0;
            // 卖股票的时候，扣除费用
            dp0=Math.max(dp0,dp1+prices[i]-fee);
            dp1=Math.max(dp1,dp0-prices[i]);
        }
        return dp0;
    }
}
