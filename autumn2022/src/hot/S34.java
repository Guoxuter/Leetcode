// 2022.11.01
package hot;

public class S34 {
    public int[] searchRange(int[] nums, int target) {
        int l, r;
        l = binarySearch(nums, target, false);
        r = binarySearch(nums, target, true);
        if (l>r) return new int[]{-1, -1};
        return new int[]{l,r};
    }

    public static int binarySearch(int[] nums, int target, boolean upper) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (nums[m] < target || (upper && nums[m] <= target)) {
                l = m + 1;
            } else r = m-1;
        }
        if(upper) return r;
        return l;
    }
}
