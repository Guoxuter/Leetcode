package Norm;// 22.3.27 3
// 无重复字符的最长子串

import java.util.HashMap;
import java.util.Map;

public class S3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;
        int start=0;
        for(int end=0;end<s.length();end++){
            char right = s.charAt(end);
            map.put(right, map.getOrDefault(right, 0) + 1);
            while (map.get(right) > 1) {
                char left = s.charAt(start);
                map.put(left, map.get(left) - 1);
                start++;
            }
            ans=Math.max(ans,end-start+1);
        }
        return ans;
    }

}
