package Prefix_and;

// 11.11 7
// 路径总和 III
import Prefix_and.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class S437 {
    Map<Integer, Integer> map = new HashMap<>();
    int ans, t;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)return 0;
        t=targetSum;
        map.put(0,1);
        dfs(root,root.val);
        return ans;
    }

    void dfs(TreeNode root, int val){
        if(map.containsKey(val-t)) ans+=map.get(val - t);
        map.put(val,map.getOrDefault(val,0)+1);
        if(root.left!=null)dfs(root.left,val+root.left.val);
        if(root.right!=null)dfs(root.right,val+root.right.val);
        map.put(val,map.getOrDefault(val,0)-1);
    }
}
