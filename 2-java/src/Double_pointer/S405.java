package Double_pointer;

// 11.1 3
// 数字转换为十六进制数
public class S405 {
    static char[] nums = new char[]{'a', 'b', 'c', 'd', 'e', 'f'};

    public static String toHex(int _num) {
        StringBuilder ans = new StringBuilder();
        long ret = 0;
        long num=_num;
        if (num < 0) num = (long) (Math.pow(2, 32) + num);

        do {
            ret = num % 16;
            if (ret <= 9) ans.append(ret);

            else {
                ans.append(nums[(int)(ret - 10)]);
            }



            num /= 16;
        } while (num > 0) ;

    return ans.reverse().toString();
    }


    public static void main(String[] args) {
        System.out.println(toHex(-2));
    }
}
