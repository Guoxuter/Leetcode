package SecondBrush;

// 12.10 3
// Leecode 11 盛最多水的容器
public class S11 {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int ans=0;
        while(i<j){

            int h=Math.max(height[i],height[j]);
            int area=h*(j-i);
            if(area>ans)ans=area;
            if(height[i]>height[j]){
                while(height[j]>height[--j])continue;
            }
            else {
                while(height[i]>height[++i])continue;
            }

        }
        return ans;
    }
}
