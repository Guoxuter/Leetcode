package Simulation;

// 整数转罗马数字
public class S12 {
    public static String intToRoman(int num) {
        int[] val = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] str = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder(20);
        int n = 0;
        String s = "";
        for (int i = 0; i < val.length; i++) {
            n = val[i];
            s = str[i];
            while (num >= n) {
                sb.append(s);
                num -= n;

            }
            if(num<=0)break;

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(3412));

    }

}

