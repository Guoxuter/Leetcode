package hot100;

import java.util.HashMap;
import java.util.Map;

public class S3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int l = 0,ans=0;
        for (int r = 0; r < s.length(); r++) {
            while(map.getOrDefault(s.charAt(r), 0)==1){
                map.put(s.charAt(l++),0);
            }
            map.put(s.charAt(r),1);
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}
