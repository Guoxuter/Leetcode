// 2022.11.23
package hot;

import java.util.Arrays;

public class S621 {
    public int leastInterval(char[] tasks, int n) {
        int[] hash=new int [26];
        for(char c:tasks){
            hash[c-'A']+=1;
        }
        Arrays.sort(hash);

        int minlen=(n+1)*(hash[25]-1)+1;

        for(int i:hash){
            if(i==hash[25])minlen++;
        }
        return Math.max(minlen,tasks.length);
    }
}
