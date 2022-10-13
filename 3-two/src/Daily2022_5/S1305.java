// 2022.5.1

// 两棵二叉搜索树中的所有元素


package Daily2022_5;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class S1305 {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ans=new ArrayList<>();
        toList(root1,ans);
        toList(root2,ans);
        Collections.sort(ans);
        return ans;

    }

    public void toList(TreeNode root, List<Integer> ans){
        if(root==null)return;
        ans.add(root.val);
        toList(root.left,ans);
        toList(root.right,ans);
    }
}
