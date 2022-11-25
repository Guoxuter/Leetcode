// 2022.11.25
package hot;

public class S538 {
    int cur=0;
    public TreeNode convertBST(TreeNode root) {
        int cur=0;

        return dfs(root);
    }

    public TreeNode dfs(TreeNode root){

        if(root==null)return root;

        root.right=dfs(root.right);

        cur+=root.val;
        root.val=cur;

        root.left=dfs(root.left);

        return root;

    }
}
