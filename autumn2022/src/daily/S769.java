// 2022.10.13
package daily;

public class S769 {
    public int maxChunksToSorted(int[] arr) {
        int m = 0, ans = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            m = Math.max(m, arr[i]);
            if (m == i) ans++;
        }
        return ans;

    }
}
