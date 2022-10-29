// 2022.10.29
package daily;

public class S45 {
    public int jump(int[] nums) {
        int maxp=0;
        int ans=0;
        int end=0;
        for(int i=0;i<nums.length-1;i++){
            maxp=Math.max(maxp,i+nums[i]);
            if(i==end){
                end=maxp;
                ans++;
            }
        }
        return ans;
    }
}
