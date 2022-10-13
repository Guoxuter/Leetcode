// 2022.5.2

// 最佳观光组合

// 动态规划


package DP;

public class S1014 {
    public static int maxScoreSightseeingPair(int[] values) {
        int i = 0, ans = 0;
        for (int j = 1; j < values.length; j++) {
            ans = Math.max(ans, values[j] + values[i] + i - j);
            System.out.println(i+"__"+j+"__"+ans);
            if (j - i > values[i] - values[j]) i = j;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] valuse = {8, 1, 5, 2, 6};
        System.out.println(maxScoreSightseeingPair(valuse));
    }
}
