// 2022.11.24
package hot;

public class S671 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return dfs(root1,root2);
    }

    public TreeNode dfs(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null){
            return null;
        }
        if(root1==null)return root2;
        if(root2==null)return root1;

        TreeNode merged=new TreeNode(root1.val+root2.val);
        merged.left=dfs(root1.left, root2.left);
        merged.right=dfs(root1.right, root2.right);

        return merged;

    }
}
