package JZOffer;

// 11.25 1
// 数组中重复的数字
import java.util.HashSet;
import java.util.Set;

public class JZ3 {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int repeat = -1;
        for (int num : nums) {
            if (!set.add(num)) {
                repeat = num;
                break;
            }
        }
        return repeat;
    }
}
