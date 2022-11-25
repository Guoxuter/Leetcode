// 2022.11.25
package hot;

public class S494 {
    int res=0;
    public int findTargetSumWays(int[] nums, int target) {
        dfs(nums,target,0,0);
        return res;
    }


    public int dfs(int[]nums,int target,int index,int sum){
        if(index==nums.length){
            if(sum==target)res++;
            return 0;
        }

        dfs(nums,target,index+1,sum+nums[index]);
        dfs(nums,target,index+1,sum-nums[index]);
        return 1;
    }
}
