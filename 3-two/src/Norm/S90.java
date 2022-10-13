package Norm;// 2022.4.15
// 子集 II

import java.util.*;

public class S90 {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans=new HashSet<>();
        List<Integer>cur =new ArrayList<>();
        dfs(nums,0,cur,ans);
        return new ArrayList<>(ans);
    }

    public static void dfs(int [] nums,int k,List<Integer> cur, Set<List<Integer>> ans){
        if(nums.length==k){
            ans.add(new ArrayList<>(cur));
            return;
        }


        // 选第k个数进行决策
        cur.add(nums[k]);
        dfs(nums,k+1,cur,ans);

        // 不选第k个数进行决策
        cur.remove(cur.size()-1);
        dfs(nums,k+1,cur,ans);
    }

    public static void main(String[] args){
        int[] n={1,2,2};
        System.out.println(subsetsWithDup(n));
    }
}
