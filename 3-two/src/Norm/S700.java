package Norm;// 2022.4.15
// 二叉搜索树中的搜索

public class S700 {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode cur=root;
        while(cur!=null)
        {
            if(cur.val==val)break;
            else if(cur.val>val)cur=cur.left;
            else cur=cur.right;
        }
        return cur;
    }
}
