package Simulation;

// Excel表列名称
public class S168 {

    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        int[] ret = new int[10];
        int n = -1;
        int i = 0;
        while (columnNumber > 26) {
            if (n == 26) n = columnNumber % 26 - 1;
            else {
                n = columnNumber % 26;
            }
            if (n == 0) n = 26;

            columnNumber /= 26;
            System.out.println(columnNumber);
            ret[i++] = n + 'A' - 1;
        }
        ret[i++] = columnNumber + 'A' - 1;
        if(n==26)ret[i-1]=ret[i-1]-1;
        for (int j = i - 1; j >= 0; j--) {
            System.out.println(ret[j]);
            if(ret[j]=='A'-1)continue;
            sb.append((char) ret[j]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(702));

    }
}
