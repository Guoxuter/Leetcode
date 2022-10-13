package Simulation;

import java.util.Arrays;

// 矩阵置零
public class S73 {
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean r0 = false, c0 = false;

        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                r0 = true;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (matrix[0][i] == 0) {
                c0 = true;
                break;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        System.out.println(r0 + "++" + c0);

        for (int i = 1; i < m; i++) {
            if (matrix[i][0] == 0) {
                Arrays.fill(matrix[i], 0);

            }
        }

        for (int j = 1; j < n; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (r0) {
            for (int i = 1; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
        if (c0) {
            Arrays.fill(matrix[0], 0);
        }
    }

    public static void btfprim(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] m = {{1, 2, 3, 4}, {5, 0, 7, 8}, {0, 6, 7, 7}, {1, 2, 3, 0}};
        setZeroes(m);
        btfprim(m);
    }
}
