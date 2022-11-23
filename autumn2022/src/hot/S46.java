// 2022.11.21
package hot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        int len = nums.length;
        boolean[] visited = new boolean[len];

        if (len == 0) return res;
        List<Integer> cur=new ArrayList<>();

        dfs(nums, len, 0,cur , visited, res);
        return res;
    }


    public void dfs(int[] nums, int len, int depth,
                    List<Integer> cur, boolean[] visited,
                    List<List<Integer>> res) {
        if (cur.size() == len) {
            res.add(cur);
            return;
        }

        for(int i=0;i<len;i++){
            if(!visited[i]){
                cur.add(nums[i]);
                visited[i]=true;
                dfs(nums, len, depth+1, cur, visited, res);
                visited[i]=false;
                cur.remove(cur.size()-1);
            }
        }


    }
}
