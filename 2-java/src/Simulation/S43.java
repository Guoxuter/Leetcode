package Simulation;

// 字符串相乘
/*给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。*/

public class S43 {
    public static String multiply(String num1, String num2) {
        int n1 = num1.length(), n2 = num2.length();
        int[] res = new int[n1 + n2];
        for (int i = n1 - 1; i >= 0; i--) {
            int a = num1.charAt(i) - '0';
            for (int j = n2 - 1; j >= 0; j--) {
                int b = num2.charAt(j) - '0';
                int r = a * b;
                r += res[i + j + 1];
                res[i + j + 1] = r % 10;
                // 这里可能出现两位数，在下次迭代中会变成一位数
                res[i + j] =res[i + j] + r / 10;

            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n1 + n2; i++) {
            if (sb.length() == 0 && res[i] == 0) continue;
            sb.append(res[i]);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }

    public static void main(String[] args) {
        multiply("123", "456");
    }
}

