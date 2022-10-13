// 2022.5.6
// 两数之和
// 1

package hot;

import java.util.HashMap;
import java.util.Map;

public class S1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {

            int x = map.getOrDefault(nums[i], -1);
            if (x != -1) {
                int[] ans={x,i};
                return ans;
            }
            map.put(target - nums[i], i);
        }
        return new int[2];

    }
}
