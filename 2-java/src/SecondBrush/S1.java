package SecondBrush;

import java.util.HashMap;
import java.util.Map;

// 11.28 1
// Leecode 1 两数之和
public class S1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map=new HashMap();
        for(int i=0;i<nums.length;i++){
            int m=target-nums[i];
            // System.out.println(m+"----"+map.containsKey(m));
            if(map.containsKey(m))return new int[]{map.get(m),i};
            else  map.put(nums[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args){
        int[] nums=new int[] {2,7,11,15};
        twoSum(nums,9);
    }
}
