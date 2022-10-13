package SecondBrush;

import java.util.HashMap;
import java.util.Map;

// 12.10 2
// Leecode 3 无重复字符的最长字串
public class S3 {
    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int l=0,r=0;r<s.length();r++){
            char c=s.charAt(r);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.get(c)>1){
                char nc=s.charAt(l);
                map.put(nc,map.get(nc)-1);
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}
