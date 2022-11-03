// 2022.11.03
package hot;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class S42 {
    public int trap(int[] height) {
        int n = height.length;
        int ans = 0;
        Deque<Integer> d = new LinkedList<>();

        for(int i=0;i<n;i++){
            while(!d.isEmpty() && height[i]>height[d.peek()]){
                int cur = d.pop();
                if(d.isEmpty())break;

                int l=d.peek(),r=i;
                int w=r-l+1-2;
                int h = Math.min(height[l], height[r]) - height[cur];
                ans +=w*h;
            }
            d.push(i);
        }
        return ans;

    }
}
