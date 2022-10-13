// 2022.5.6
// 最近的请求次数
// 每日一题


package Daily2022_5;

import java.util.ArrayDeque;
import java.util.Queue;

public class S933 {
    Queue<Integer> queue;
    public RecentCounter() {
        queue = new ArrayDeque<Integer>();
    }

    public int ping(int t) {
        queue.offer(t);
        while(queue.peek()<t-3000){
            queue.poll();
        }
        return queue.size();
    }
}
