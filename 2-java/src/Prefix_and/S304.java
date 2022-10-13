package Prefix_and;

// 11.11 6
// 二位区域和检索-矩阵不可变
public class S304 {
    int[][] sum;
    public void NumMatrix(int[][] matrix) {
        int n = matrix.length, m = n == 0 ? 0 : matrix[0].length;
        // 与「一维前缀和」一样，前缀和数组下标从 1 开始，因此设定矩阵形状为 [n + 1][m + 1]（模板部分）
        sum = new int[n + 1][m + 1];
        // 预处理除前缀和数组（模板部分）
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + matrix[i - 1][j - 1];
            }
        }

    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        //System.out.print(sum[row2+1][col2+1]+"_"+sum[row1][col1]+"_"+sum[row2][col1]+"_"+sum[row1][col2]);
        //System.out.println();
        return (sum[row2+1][col2+1]+sum[row1][col1]-sum[row2+1][col1]-sum[row1][col2+1]);

    }
}
