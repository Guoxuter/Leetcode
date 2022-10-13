package Sliding_window;


// 11.11 3
// 替换后的最长重复字符
public class S424 {
    public static int characterReplacement(String s, int k) {
        int max = 0;
        int[] count = new int[26];
        int ans = 0;
        for (int i = 0, j = 0; i < s.length() && j < s.length(); i++) {

            while (j < s.length()) {
                char c = s.charAt(j);
                count[c - 'A'] += 1;
                // System.out.println("max="+max);
                if (max < count[c - 'A']) max = count[c - 'A'];

                System.out.println();
                if (j-i+1 - k <= max) {
                    ans = Math.max(ans, j - i + 1);
                    j++;
                } else {
                    j++;
                    c = s.charAt(i);
                    count[c - 'A'] -= 1;

                    for (int m = 0; m < 26; m++) {
                        max = Math.max(max, count[m]);
                    }
                    break;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(characterReplacement("ABAB",2 ));
    }
}
