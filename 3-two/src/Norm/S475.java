package Norm;// 2022.4.14
// 供暖器

import java.util.Arrays;

public class S475 {
    public static int findRadius(int[] houses, int[] heaters) {
        int ans=0;
        Arrays.sort(heaters);

        for(int h:houses){
            int i=binarySearch(heaters,h);
            int cur=0,d1=0,d2=0;
            d1=Math.abs(h-heaters[i]);
            if(i+1>=heaters.length) d2=Integer.MAX_VALUE;
            else d2=heaters[i+1]-h;
            System.out.println(i+"_"+d1+"_"+d2);
            cur=Math.min(d1,d2);
            ans =Math.max(ans,cur);
        }
        return ans;

    }

    public static int binarySearch(int[] nums,int target){
        int l=0,r=nums.length-1;

        while(l<r){
            int m=l+r+1>>1;
            if(nums[m]>target)r=m-1;
            else if(nums[m]<target) l=m;
            else return m;
        }
        return l;
    }

    public static void main(String[] args){
        int [] nums={1,2,3,4};
        int [] h={2,3,4};
        System.out.println(findRadius(nums,h));

    }
}
