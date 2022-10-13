package Simulation;
//最大回文
public class S5 {
    public static String longestPalindrome(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            // 回文串为奇数
            int l = i - 1, r = i + 1;
            String sub = getString(s, l, r);
            if (sub.length() > ans.length()) ans = sub;

            // 回文串为偶数
            l = i - 1;
            r = i + 1 - 1;
            sub = getString(s, l, r);
            if (sub.length() > ans.length()) ans = sub;
        }
        return ans;
    }

    static String getString(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }

    public static void main(String args[]) {
        String a = "aeuioi";
        getString(a,-1,1);
        longestPalindrome(a);


    }
}
