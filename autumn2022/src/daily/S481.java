// 2022.10.31
package daily;

public class S481 {
    public int magicalString(int n) {
        if (n < 4) return 1;
        StringBuilder sb = new StringBuilder();
        sb.append("122");
        int ans = 1;
        int l = 2, r = 3;
        while (r < n) {
            int size = sb.charAt(l) - '0';

            int num = 3 - sb.charAt(r - 1) + '0';

            while (size > 0 && r < n) {
                sb.append(num);
                if (num == 1) ans++;
                r++;
                size--;
            }
            l++;
        }
        return ans;
    }
}
