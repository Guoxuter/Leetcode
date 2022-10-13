package Backtracking_algorithm;

import java.util.*;

// 11.15 4
// 组合总和II
public class S40 {
    public static List<List<Integer>> combinationSum2(int[] cs, int target) {
        Set<List<Integer>> ans = new HashSet<>();
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(cs);
        dfs(cs, target, ans, cur, 0);
        return new ArrayList<>(ans);
    }

    public static void dfs(int[] cs, int t, Set<List<Integer>> ans, List<Integer> cur, int index) {

        if (t == 0) {
            Collections.sort(cur);
            ans.add(new ArrayList<Integer>(cur));
            return;
        }
        if (index == cs.length) return;
        if (t < 0) return;


        if (t - cs[index] >= 0) {
            cur.add(cs[index]);
            dfs(cs, t - cs[index], ans, cur, index + 1);
            cur.remove(cur.size() - 1);
        }

        dfs(cs, t, ans, cur, index + 1);
    }

    public static void main(String[] args) {
        int[] cs = new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        System.out.println(cs.length);
        //System.out.println(combinationSum2(cs, 27));
    }
}
