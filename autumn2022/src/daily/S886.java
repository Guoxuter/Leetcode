// 2022.10.16
package daily;

import java.util.ArrayList;
import java.util.List;

public class S886 {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        int[] color = new int[n + 1];
        List<Integer>[] g = new List[n + 1];
        for (int i = 0; i <= n; ++i) {
            g[i] = new ArrayList<Integer>();
        }
        for (int[] p : dislikes) {
            g[p[0]].add(p[1]);
            g[p[1]].add(p[0]);
        }

        for (int i = 0; i < n; i++) {
            if (color[i] == 0) {
                boolean k = dfs(i, 1, color, g);
                if (!k) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean dfs(int cur, int nowcolor, int[] color, List<Integer>[] g) {
        color[cur] = nowcolor;
        for (int nextnode : g[cur]) {
            if (color[nextnode] != 0 && color[cur] == color[nextnode]) {
                return false;
            }
            if (color[nextnode] == 0) {
                boolean k = dfs(nextnode, 0 - nowcolor, color, g);
                if (!k) return false;
            }
        }
        return true;
    }
}
