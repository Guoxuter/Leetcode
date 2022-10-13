package Double_pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 11.7 2
// 三数之和
public class S15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            // 与上次枚举的数字相同直接跳过
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int k = n - 1;
            int target = -nums[i];
            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                while (j < k && nums[j] + nums[k] > target) k--;
                // j，k相同不符合要求
                if (j == k) break;

                if (nums[j] + nums[k] == target) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(list);
                }

            }

        }


        return ans;
    }

    public static void main(String[] args) {

    }
}
