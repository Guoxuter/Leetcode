package Binary_tree;

import java.util.Deque;
import java.util.LinkedList;

// 11.25 4
// 重建二叉树： 给定前序遍历和中序遍历，复原二叉树
public class JZ7 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        int n =preorder.length;
        TreeNode root = new TreeNode(preorder[0]);
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        stack.push(root);
        int inorderIndex = 0;

        for(int i=1;i<n;i++){
            int preval=preorder[i];
            TreeNode node=stack.peek();
            if(node.val!=inorder[inorderIndex]){
                node.left=new TreeNode(preval);
                stack.push(node.left);
            }
            else{
                while(!stack.isEmpty()&&stack.peek().val==inorder[inorderIndex]){
                    node=stack.pop();
                    inorderIndex++;
                }
                node.right=new TreeNode(preval);
                stack.push(node.right);
            }

        }
        return root;
    }

}
