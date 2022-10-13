package Backtracking_algorithm;

import java.util.*;

// 11.15 6
// 分割回文串
public class S131 {
    int n;
    boolean[][] f;

    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> cur=new ArrayList<>();
        n = s.length();
        f = new boolean[n][n];
        for (int i = 0; i < n; ++i) {
            Arrays.fill(f[i], true);
        }
        for (int i = n - 1; i >= 0; --i) {
            for (int j = i + 1; j < n; ++j) {
                f[i][j] = (s.charAt(i) == s.charAt(j)) && f[i + 1][j - 1];
            }
        }

        dfs(s,ans,cur,0);

        return ans;
    }

    public void dfs(String s,List<List<String>> ans,List<String> cur,int index){
        if (index == n) {
            ans.add(new ArrayList<String>(cur));
            return;
        }
        for (int j = index; j < n; ++j) {
            if (f[index][j]) {
                cur.add(s.substring(index, j + 1));
                dfs(s,ans,cur, j + 1);
                cur.remove(cur.size() - 1);
            }
        }
    }

}
