package Binary_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 11.25 6
// 从上到下打印二叉树 II
public class JZ32 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return ans;
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            int n=queue.size();
            for(int i=n;i>0;i--){
                TreeNode node=queue.poll();
                tmp.add(node.val);
                if(node.left!=null)queue.add(node.left);
                if(node.right!=null)queue.add(node.right);
            }
            ans.add(tmp);
        }
        return ans;
    }
}
