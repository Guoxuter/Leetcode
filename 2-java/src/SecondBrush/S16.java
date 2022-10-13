package SecondBrush;

import java.util.Arrays;

// 12.10 5
// Leecode 16 最接近的三数之和
public class S16 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int sum=900000;
        int ans=0;
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int div= nums[i]+nums[j]+nums[k];
                if(sum>Math.abs(target-div)){ans=div;
                    sum=Math.abs(target-div);}
                if(target>div)j++;
                else k--;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] n= new int[]{-1,2,1,-4};
        int ans = threeSumClosest(n,1);
        System.out.println(ans);
    }
}
