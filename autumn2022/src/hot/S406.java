// 2022.11.27
package hot;

import java.util.Arrays;
import java.util.Comparator;

public class S406 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            public int compare(int[] person1, int[] person2) {
                if (person1[0] != person2[0]) {
                    return person1[0] - person2[0];
                } else {
                    return person2[1] - person1[1];
                }
            }
        });

        int n = people.length;
        int[][] ans = new int[n][];
        for (int[] p : people) {
            int spaces = p[1] + 1;
            for (int i = 0; i < n; i++) {
                if (ans[i] == null) {
                    spaces--;
                    if (spaces == 0) {
                        ans[i] = p;
                        break;
                    }
                }
            }
        }
        return ans;
    }
}