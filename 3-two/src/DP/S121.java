// 2022.5.2

// 买卖股票的最佳时机

// 动态规划

package DP;

public class S121 {
    public int maxProfit(int[] prices) {
        int buy = prices[0], ans = 0;
        for (int x : prices) {
            buy = Math.min(buy, x);
            ans = Math.max(ans, x - buy);
        }
        return ans;
    }
}
