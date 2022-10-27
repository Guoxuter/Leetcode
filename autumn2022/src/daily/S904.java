package daily;

import java.util.HashMap;
import java.util.Map;

public class S904 {
    public int totalFruit(int[] fruits) {
        int l=0,ans=0;
        Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();

        for(int r=0;r<fruits.length;r++){
            cnt.put(fruits[r],cnt.getOrDefault(fruits[r],0)+1);
            while(cnt.size()>2){
                cnt.put(fruits[l], cnt.get(fruits[l]) - 1);
                if(cnt.get(fruits[l])==0)cnt.remove(fruits[l]);
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}
