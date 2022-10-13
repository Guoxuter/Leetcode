package Binary_tree;

// 11.12 4
// 搜索二维矩阵
public class S74 {
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix.length==0)return false;
        int m=matrix.length,n=matrix[0].length;
        int i=0,j=n-1;
        int cur=0;
        while(j>=0 && i<m){
            cur=matrix[i][j];
            if(cur >target)j--;
            else if(cur <target)i++;
            else return true;
        }
        return false;
    }
}
