package SecondBrush;

// 12.9 1
// Leecode 5 最长回文子串
public class S5 {
    public String longestPalindrome(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            int l = i - 1, r = i + 1;
            String sub = getString(s, l, r);

            l = i - 1;
            r = i - 1 + 1;
            sub = getString(s, l, r);
            if (sub.length() > ans.length()) ans = sub;

        }
        return ans;
    }

    public String getString(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            r++;
            l--;
        }
        return s.substring(l+1,r);
    }
}
