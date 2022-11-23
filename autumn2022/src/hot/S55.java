// 2022.11.21
package hot;

public class S55 {
    public static boolean canJump(int[] nums) {
        int cur=0;
        int maxp=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxp)return false;
            maxp=Math.max(maxp,i+nums[i]);
        }
        return true;
    }

    public static void main(){

        int [] nums={3,2,1,0,4};
        System.out.println(canJump(nums));
    }
}
