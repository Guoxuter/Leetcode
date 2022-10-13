package Double_pointer;

import java.util.Arrays;

// 11.7 3
// 最接近的三数之和
public class S16 {

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1, k = n - 1;
            while (j < k) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    j++;
                    continue;
                }
                int sum = nums[i] + nums[j] + nums[k];
                System.out.print(i + "_" + j + "_" + k + "__" + sum);
                if (Math.abs(sum - target) < Math.abs(ans - target))
                    ans = sum;


                if (sum < target) j++;
                else if (sum == target) return ans;
                else k--;

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 4, 8, 16, 32, 64, 128};
        System.out.println(threeSumClosest(nums, 82));
    }
}
