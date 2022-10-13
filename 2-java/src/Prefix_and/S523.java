package Prefix_and;

import java.util.HashMap;
import java.util.Map;

// 11.11 8
// 连续的子数组和
public class S523 {
    public static boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        if (n < 2) return false;
        int[] sum = new int[n + 1];
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 1; i <= n; i++)
            sum[i] = sum[i - 1] + nums[i - 1];
        for (int i = 2; i <= n; i++) {

            if (map.containsKey(sum[i] % k)) return true;
            else map.put(sum[i-1] % k, 1);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] n = new int[]{1, 0};
        System.out.println(checkSubarraySum(n, 2));
    }
}
