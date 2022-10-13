package Simulation;
// 两数相加
import java.util.HashMap;
import java.util.Map;

public class S1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i], b = target - a;
            if (map.containsKey(b)) return new int[]{map.get(b), i};
            map.put(a, i);
        }


        return new int[]{};
    }

    public static void main(String args[]) {
        int[] nums = {1,3,5,6,8,9,10,22};
        int target = 10;

        int[] fl = twoSum(nums, target);
        System.out.println(fl[0]+" "+fl[1]);
    }
}

