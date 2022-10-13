package Norm;// 22.3.31 424
// 替换后的最长重复字符

public class S424 {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int l = 0, r = 0;
        int[] cur = new int[26];
        while (r < s.length()) {
            cur[s.charAt(r) - 'A'] += 1;

            max = Math.max(cur[s.charAt(r) - 'A'], max);
            if (r - l + 1 > k + max) {
                cur[s.charAt(l) - 'A'] -= 1;
                l++;
            }
            r++;
        }
        return r-l;
    }
}
