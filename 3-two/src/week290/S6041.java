package week290;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class S6041 {
    public static List<Integer> intersection(int[][] nums) {
        List<Integer> ans = new ArrayList<>();
        if (nums.length == 1) {
            for (int i : nums[0]) ans.add(i);
            Collections.sort(ans);
            return ans;
        }

        for (int i : nums[0]) {
            for (int j = 1; j < nums.length; j++) {
                boolean tag=true;
                for(int k:nums[j]){
                    if(k==i)tag=false;
                }
                if (tag) break;
                if (j == nums.length - 1)ans.add(i);

            }
        }

        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args){
        int[][]nums={{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        System.out.println(intersection(nums));
    }
}
