package SecondBrush;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 12.10 4
// Leecode 15 三数之和
public class S15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1, k = n - 1;

            while (j < k) {
                while (j > i + 1 && j < k && nums[j] == nums[j - 1]) j++;
                if (j >= k) break;
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) j++;
                else if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                } else k--;
            }

        }
        return ans;
    }
}
