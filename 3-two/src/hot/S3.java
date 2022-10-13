// 2022.5.9
// 无重复字符的最长子串
// 3

package hot;

import java.util.HashMap;
import java.util.Map;

public class S3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0;
        int ans = 0;
        while (j<s.length()) {

            char c = s.charAt(j);
            if (map.getOrDefault(c, 0) == 0) {
                map.put(c, 1);

            } else {
                while (s.charAt(i) != c) {
                    map.put(s.charAt(i), 0);
                    i++;
                }

                i++;
            }
            ans = Math.max(ans, j - i + 1);
            j++;
        }
        return ans;
    }
}
