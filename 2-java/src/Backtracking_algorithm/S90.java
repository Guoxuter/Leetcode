package Backtracking_algorithm;

import java.util.*;

// 11.15 5
// 子集II
public class S90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> ans=new HashSet<>();
        List<Integer> cur =new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums,ans,cur,0);
        return new ArrayList<>(ans);
    }

    public void dfs(int[]nums,Set<List<Integer>>ans,List<Integer> cur,int index){

        if(index==nums.length){ans.add(new ArrayList<>(cur));return;}

        dfs(nums,ans,cur,index+1);

        cur.add(nums[index]);
        dfs(nums,ans,cur,index+1);
        cur.remove(cur.size()-1);
    }
}
