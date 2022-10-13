package Simulation;

// 字符串转换整数 2021.10.21
public class S8 {
    public static int myAtoi(String s) {
        int n = s.length();
        char[] c = s.toCharArray();


        int i = 0;

        while (i < n &&c[i] == ' ') {
            i++;
        }
        int sym = 1;
        if (i == n) return 0;
        else if(c[i] == '-') {
            sym *= -1;
            i++;
        }
        else if(c[i] == '+') {
            i++;
        }
        else if(!Character.isDigit(c[i])) {
            return 0;
        }

        int ret = 0;

        while (i < n) {
            if(!Character.isDigit(c[i]))break;

            int cur = c[i] - '0';
            if (sym > 0 && ret > (Integer.MAX_VALUE - cur) / 10) return Integer.MAX_VALUE;
            else if(sym < 0 && ret > (Integer.MAX_VALUE - cur) / 10) return Integer.MIN_VALUE;

            ret=ret*10+cur;
            i++;
        }

        return ret*sym;


    }

    public static void main(String args[]){
        System.out.println(Integer.MAX_VALUE);

    }
}
