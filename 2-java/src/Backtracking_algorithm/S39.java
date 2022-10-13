package Backtracking_algorithm;

import java.util.ArrayList;
import java.util.List;

// 11.15 3
// 组合总和
public class S39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        dfs(candidates, target, ans,cur,0);
        return ans;
    }

    void dfs(int[] cs, int t,  List<List<Integer>> ans, List<Integer> cur, int index) {
        if(index==cs.length)return;
        if(t==0){
            ans.add(new ArrayList<Integer>(cur));
            return;
        }

        dfs(cs,t,ans,cur,index+1);

        if(t-cs[index]>=0){
            cur.add(cs[index]);
            dfs(cs,t-cs[index],ans,cur,index);
            cur.remove(cur.size()-1);
        }
        return;
    }
}
