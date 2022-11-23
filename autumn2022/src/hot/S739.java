// 2022.11.23
package hot;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class S739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int n= temperatures.length;
        int [] res=new int [n];
        Arrays.fill(res,0);
        Deque<Integer> stack = new LinkedList<>();

        for(int i=0;i<n;i++){
            while(!stack.isEmpty()&&temperatures[stack.peek()]<temperatures[i]){
                int tem=stack.pop();
                res[tem]=i-tem;
            }
            stack.push(i);
        }
        return res;

    }
}

