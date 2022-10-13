package Binary_tree;

// 11.25 3
// 二叉搜索树的第k大节点

// 二叉搜索树 若它的左子树不空，则左子树上所有结点的值均小于它的根结点的值； 若它的右子树不空，则右子树上所有结点的值均大于它的根结点的值； 它的左、右子树也分别为二叉排序树
import Binary_tree.TreeNode;

public class JZ54 {

    int res, k;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }

    void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.right);
        if (k == 0) return;
        --k;
        if (k == 0) res = root.val;
        dfs(root.left);
    }
}
