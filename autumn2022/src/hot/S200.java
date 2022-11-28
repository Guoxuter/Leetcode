// 2022.11.28
package hot;

import java.util.Arrays;

public class S200 {
    public int numIslands(char[][] grid) {
        int ans = 0;
        int m = grid.length, n = grid[0].length;
        char[][] grids = new char[m + 2][n + 2];

        for(int i=0;i<m+2;i++)Arrays.fill(grids[i],'0');
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grids[i + 1][j + 1] = grid[i][j];
            }
        }


        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (grids[i][j] == '1') {
                    ans++;
                    dfs(grids, i, j);
                }
            }
        }
        return ans;

    }

    public void dfs(char[][] grid, int r, int c) {
        if (grid[r][c] == '0') return;
        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }
}
