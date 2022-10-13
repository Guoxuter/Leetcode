package Double_pointer;

// 11.7 1
// 盛水最多的容器
public class S11 {

    public static int maxArea(int[] height) {
        int i = 0, j = height.length-1;
        int h=0,max = 0;
        while (i != j) {
            if(height[i]>height[j]){h=height[j];j--;}
            else {h=height[i];i++;}


            max=Math.max(max,h*(j-i+1));
        }
        return max;
    }

    public static void main(String[] args){
        int[] n=new int[]{1,1};
        System.out.print(maxArea(n));
    }

}
