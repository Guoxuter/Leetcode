package Double_pointer;

// 11.6 4
// 压缩字符串
public class S443 {
    public static int compress(char[] chars) {

        int j = 0, i = 0, n = 1;
        int start;
        char  cur;
        if (chars.length == 1) return 1;
        while (i < chars.length) {
            cur = chars[i++];
            if (i<chars.length && cur == chars[i]) n++;


            if (i == chars.length||cur != chars[i]  ) {

                chars[j++] = cur;

                if (n > 1) {

                    start=j;
                    while (n != 0) {
                        chars[j++] = (char) ((n % 10) + '0');
                        n /= 10;
                    }
                    reverse(chars,start,j-1);


                }
                n = 1;
            }
        }
        return j;
    }

    public static void reverse(char[] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }}

    public static void main(String[] args) {
        char[] chars = new char[]{'a', 'b', 'c'};

        System.out.println(compress(chars));
        for (char x : chars) {
            System.out.print(x);
        }

    }
}
