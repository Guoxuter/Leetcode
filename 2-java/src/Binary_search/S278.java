package Binary_search;

// 11.15 2
// 第一个错误版本
public class S278 {
    public int firstBadVersion(int n) {
        int l = 1, r = n;
        while (l < r) {
            long tmp = (long) l + r >> 1;
            int mid = (int) tmp;
            /*if (isBadVersion(mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }*/
        }
        return r;
    }

}

