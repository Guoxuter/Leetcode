package Norm;// 2022.4.12
// 子数组最大平均数 I


public class S643 {
    public static double findMaxAverage(int[] nums, int k) {
        int ans = 0, l = 0, r;
        for (int i = 0; i < k; i++)
            ans += nums[i];

        r = k - 1;
        int cur = ans;

        while (r < nums.length - 1) {

            cur += nums[++r];
            cur -= nums[l++];

            if (cur > ans) ans = cur;
        }
        return 1.0 * ans / k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        findMaxAverage(nums, 4);
    }
}
