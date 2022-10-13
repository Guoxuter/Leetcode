package Norm;// 2022.4.14
// 有效的完全平方数

public class S367 {
    public static boolean isPerfectSquare(int num) {
        long l=0,r=num/2+1;

        while(l<r){
            long mid=l+r>>1;
            if(mid*mid>num)r=mid;
            else if(mid*mid<num)l=mid+1;
            else return true;
        }
        if(l*l==num)return true;
        return false;
    }

    public static void main(String[] args){
        System.out.println(isPerfectSquare(808201));
    }

}
