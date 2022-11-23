// 2022.11.22
package jianzhi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class S03 {
    public int findRepeatNumber(int[] nums) {
        Set< Integer> map = new HashS
        et<>();
        for (int num : nums) {
            if(map.contains(num)) return num;
            map.add(num);
        }
        return -1;
    }
}
