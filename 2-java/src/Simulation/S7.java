package Simulation;

// 整数反转
public class S7 {
    public static int reverse(int x) {
        int res = 0;
        while (x != 0) {

            // 判断溢出条件
            if (x > 0 && res > (Integer.MAX_VALUE - x % 10) / 10) return 0;
            if (x < 0 && res < (Integer.MIN_VALUE - x % 10) / 10) return 0;
            res *= 10;
            res += x % 10;
            x /= 10;

        }
        return res;
    }

    public static void main(String args[]) {
        System.out.print(Integer.MIN_VALUE);
    }

    // Z字抖动
    public static class S6 {
        public static String convert(String s, int numRows) {
            int n = s.length();
            if (n == 1 || numRows == 1) return s;
            StringBuilder sb = new StringBuilder(n);
            int tmp = 0;
            int tmp2 = 0;
            for (int i = 0; i < numRows; i++) {


                if (i == 0 || i == numRows - 1) {
                    tmp = i;
                    while (tmp < n) {
                        sb.append(s.charAt(tmp));
                        tmp = tmp+ 2*(numRows - 1);
                    }
                } else {
                    tmp = i;
                    tmp2 = (numRows - i-1) * 2 +i;
                    while (tmp < n) {
                        sb.append(s.charAt(tmp));
                        if (tmp2 < n)sb.append(s.charAt(tmp2));


                        tmp =tmp+ 2*(numRows - 1);
                        tmp2 =tmp2+ 2* (numRows - 1);
                    }

                }
            }
            return sb.toString();


        }

        public static void main(String args[]) {
            System.out.println(convert("PAYPALISHIRING", 4));
        }
    }
}
