package Norm;// 2022.4.12
// 可获得的最大点数

public class S1423 {
    public static int maxScore(int[] cardPoints, int k) {
        int l = k - 1, r = cardPoints.length - 1;
        int ans = 0;
        for (int i = 0; i < k; i++) {
            ans += cardPoints[i];
        }

        int cur = ans;
        while (l >= 0) {
            cur += cardPoints[r--];
            cur -= cardPoints[l--];
            if (cur > ans) ans = cur;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5, 6, 1};
        maxScore(n, 3);
    }
}
