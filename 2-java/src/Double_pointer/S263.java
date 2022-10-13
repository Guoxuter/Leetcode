package Double_pointer;

// 11.1 1
// 丑数
public class S263 {
    public static boolean isUgly(int n) {
        if(n==0)return false;
        while (n % 5 == 0) {

            n=n/5;
        }

        while(n%3==0)
        {
            n=n/3;

        }
        while(n%2==0){
            n=n/2;

        }
        System.out.println(n);
        if(n==1)return true;

        return false;
    }

    public static void main(String[] args){
        isUgly(6);
    }
}
