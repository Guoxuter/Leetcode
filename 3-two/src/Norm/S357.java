package Norm;// 2022.4.11
// 统计各位数字都不同的数字个数

public class S357 {
    public static int countNumbersWithUniqueDigits(int n) {
        if(n==0)return 1;
        if(n==1)return 10;
        int a=10,b=9;
        for(int i=2;i<=n;i++){
            b*=(10-i+1);
            a+=b;
        }
        return a;
    }

    public static void main(String[] args){

        System.out.println(countNumbersWithUniqueDigits(4));
    }
}
