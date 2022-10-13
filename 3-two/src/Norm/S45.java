package Norm;// 22.3.30 45
// 跳跃游戏

public class S45 {
    public static int jump(int[] nums){
        int end=0;
        int ans=0;
        int step=0;
        for(int i=0;i<nums.length-1;i++){
            // 这里-1的作用是，防止当i==end==nums.length时，ans+1
            step=Math.max(step,nums[i]+i);
            if(i==end){
                ans++;
                end=step;
            }
        }
        return ans;

    }

    public static int jump1(int[] nums) {
        if(nums.length==1)return 0;
        int start=0,end=1;
        int ans=0;
        if(start+end>=nums.length)return ans+1;
        while(end<nums.length){
            int step=0;

            for(int i=start;i<end;i++){
                if(step-nums[i]>i)step=i+nums[i];
            }
            start=end;
            end=end+step;
            ans++;


        }
        return ans;
    }

    public static void main(String[] args){
        int[] nums={1,2,0,1};
        System.out.println(jump(nums));
    }
}
