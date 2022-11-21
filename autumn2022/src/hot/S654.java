// 2022.11.03
package hot;

import java.util.ArrayDeque;
import java.util.Deque;

public class S654 {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        Deque<Integer> d = new ArrayDeque<Integer>();
        TreeNode[] trees=new TreeNode[nums.length];
        for(int i=0;i<nums.length;i++){
            trees[i] = new TreeNode(nums[i]);
            while(!d.isEmpty() && nums[i]>nums[d.peek()]){
                trees[i].left = trees[d.peek()];
                d.pop();
            }
            if(!d.isEmpty()){
                trees[d.peek()].right=trees[i];
            }
            d.push(i);
        }
        int target= nums.length-1;
        while(!d.isEmpty()){
            target=d.pop();
        }
        return trees[target];
    }
}
