package Norm;// 2022.4.13
// 分数到小数

import java.util.HashMap;
import java.util.Map;

public class S166 {
    public String fractionToDecimal(int numerator, int denominator) {
        long a=numerator,b=denominator;
        // 本身能够整除
        if (a % b == 0) return String.valueOf(a / b);

        StringBuilder sb = new StringBuilder();
        // 如果其一为负数，先追加负号
        if (a * b < 0) sb.append('-');
        a = Math.abs(a); b = Math.abs(b);

        sb.append(String.valueOf(a / b) + ".");
        a%=b;

        // 利用哈希表存储已经有的余数
        Map<Long, Integer> map = new HashMap<>();
        while(a!=0){
            map.put(a,sb.length());
            a*=10;
            sb.append(a/b);
            a%=b;

            if(map.containsKey(a)){
                int u=map.get(a);
                return String.format("%s(%s)",sb.substring(0,u),sb.substring(u));
            }
        }
        return sb.toString();
    }


    public String fuxi (int numerator, int denominator){
        long a=numerator,b=denominator;

        if(a%b==0)return String.valueOf(a / b);

        StringBuilder sb = new StringBuilder();
        Map<Long,Integer>map=new HashMap<>();

        if(a*b<0)sb.append('-');
        a=Math.abs(a);
        b=Math.abs(b);

        sb.append(String.valueOf(a / b) + ".");
        a%=b;
        while(a!=0){


            map.put(a,sb.length());
            a*=10;
            sb.append(a / b);
            a%=b;

            if(map.containsKey(a)){
                int u=map.get(a);
                return String.format("%s(%s)",sb.substring(0,u),sb.substring(u));
            }

        }
        return sb.toString();



    }
}
