// 2022.10.13
package hot;

import java.util.HashMap;
import java.util.Map;

public class S3 {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int r = 0; r < s.length(); r++) {



            if(map.getOrDefault(s.charAt(r),0)==1){
                while(s.charAt(l)!=s.charAt(r)){
                    map.put(s.charAt(l++),0);
                }
                map.put(s.charAt(l),0);
                l++;
            }

            map.put(s.charAt(r),1);
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}
