package Sliding_window;

import java.util.HashMap;
import java.util.Map;

public class S3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int ans=0;
        char c;
        for(int i=0,j=0;j<s.length();j++){
            c=s.charAt(j);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.get(c)>1){
                char c2=s.charAt(i++);
                map.put(c2,map.get(c2)-1);
            }
            if(j-i+1>ans)ans=j-i+1;
        }
        return ans;

    }

}
