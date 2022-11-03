// 2022.11.03
package hot;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class S496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Deque<Integer> d = new ArrayDeque<Integer>();
        int [] ans =new int [nums1.length];
        for(int i=nums2.length-1;i>=0;i--){
            int num=nums2[i];
            while(!d.isEmpty()&& num >d.peek()){
                d.pop();
            }
            map.put(num,d.isEmpty() ? -1 : d.peek());
            d.push(num);
        }

        for(int i=0;i<nums1.length;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }
}
