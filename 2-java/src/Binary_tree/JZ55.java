package Binary_tree;

// 11.25 2
// 二叉树的深度
import Binary_tree.TreeNode;
public class JZ55 {
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }
}
