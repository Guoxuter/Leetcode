package Binary_tree;


// 11.25 5
// 二叉树镜像
public class JZ27 {
    public TreeNode mirrorTree(TreeNode root) {
        dfs(root);
        return root;
    }

    public void dfs(TreeNode root){
        if(root == null)return;
        TreeNode res=root.left;
        root.left=root.right;
        root.right=res;
        dfs(root.left);
        dfs(root.right);
    }
}
