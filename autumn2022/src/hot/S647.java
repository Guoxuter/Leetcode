// 2022.11.23
package hot;

public class S647 {
    public int countSubstrings(String s) {
        int ans = 0;
        for (int i = 0; i < s.length() * 2 - 1; i++) {
            int l = i / 2, r = i / 2 + i % 2;

            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
                ans++;
            }
        }
        return ans;
    }
}
