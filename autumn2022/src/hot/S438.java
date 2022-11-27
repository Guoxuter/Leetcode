// 2022.11.27
package hot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S438 {
    public List<Integer> findAnagrams(String s, String p) {
        int l=0,n=p.length();
        List<Integer> res=new ArrayList<>();
        char [] ps= p.toCharArray();
        Arrays.sort(ps);
        while(l+n<=s.length()){
            char[] ret=s.substring(l,l+n).toCharArray();
            Arrays.sort(ret);
            if(Arrays.equals(ret,ps) ){
                res.add(l);
            }
            l++;
        }
        return res;
    }
}
