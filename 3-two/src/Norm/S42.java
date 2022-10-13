package Norm;// 2022.5.3
// 接雨水
// 双指针


public class S42 {
    public int trap(int[] height) {
        int ans=0;
        int l=0,r=height.length-1;
        int lm=0,rm=0;
        while(l<r){

            lm=Math.max(height[l],lm);
            rm=Math.max(height[r],rm);
            if(height[l]<height[r]){
                ans+=lm-height[l];
                l++;
            }
            else{
                ans+=rm-height[r];
                r--;
            }
        }
        return ans;

    }
}
