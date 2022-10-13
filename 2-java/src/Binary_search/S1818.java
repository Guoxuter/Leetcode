package Binary_search;


import java.util.Arrays;

// 11.12 3
// 绝对差值和
public class S1818 {
    static int mod = (int) 1e9 + 7;

    public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int[] sorted = nums1.clone();
        Arrays.sort(sorted);
        long sum = 0, max = 0;

        for (int i = 0; i < n; i++) {
            int a = nums1[i], b = nums2[i];
            if (a == b) continue;
            int x = Math.abs(a - b);

            int l = 0, r = n - 1;
            while (l < r) {
                int mid = l + r >> 1;
                if (sorted[mid] > b) r = mid;
                else l = mid+1 ;
            }
            int nx = Math.abs(sorted[l] - b);
            if (l >0) nx = Math.min(nx, Math.abs(sorted[l - 1] - b));
            max = Math.max(max, Math.abs(nx - x));
            sum += x;
        }
        return (int) ((sum - max) % mod);


    }

    public static int minAbsoluteSumDiff2(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] sorted = nums1.clone();
        Arrays.sort(sorted);
        long sum = 0, max = 0;
        for (int i = 0; i < n; i++) {
            int a = nums1[i], b = nums2[i];
            if (a == b) continue;
            int x = Math.abs(a - b);
            sum += x;
            int l = 0, r = n - 1;
            while (l < r) {
                int mid = l + r + 1 >> 1;
                if (sorted[mid] <= b) l = mid;
                else r = mid - 1;
            }
            int nd = Math.abs(sorted[r] - b);
            if (r + 1 < n) nd = Math.min(nd, Math.abs(sorted[r + 1] - b));
            if (nd < x) max = Math.max(max, x - nd);
        }
        return (int) ((sum - max) % mod);
    }

    public static void main(String[] args) {
        int[] n1 = new int[]{57, 42, 21, 28, 30, 25, 22, 12, 55, 3, 47, 18, 43, 29, 20, 44, 59, 9, 43, 7, 8, 5, 42, 53, 99, 34, 37, 88, 87, 62, 38, 68, 31, 3, 11, 61, 93, 34, 63, 27, 20, 48, 38, 5, 71, 100, 88, 54, 52, 15, 98, 59, 74, 26, 81, 38, 11, 44, 25, 69, 79, 81, 51, 85, 59, 84, 83, 99, 31, 47, 31, 23, 83, 70, 82, 79, 86, 31, 50, 17, 11, 100, 55, 15, 98, 11, 90, 16, 46, 89, 34, 33, 57, 53, 82, 34, 25, 70, 5, 1};

        int[] n2 = new int[]{76, 3, 5, 29, 18, 53, 55, 79, 30, 33, 87, 3, 56, 93, 40, 80, 9, 91, 71, 38, 35, 78, 32, 58, 77, 41, 63, 5, 21, 67, 21, 84, 52, 80, 65, 38, 62, 99, 80, 13, 59, 94, 21, 61, 43, 82, 29, 97, 31, 24, 95, 52, 90, 92, 37, 26, 65, 89, 90, 32, 27, 3, 42, 47, 93, 25, 14, 5, 39, 85, 89, 7, 74, 38, 12, 46, 40, 25, 51, 2, 19, 8, 21, 62, 58, 29, 32, 77, 62, 9, 74, 98, 10, 55, 25, 62, 48, 48, 24, 21};

        System.out.println(minAbsoluteSumDiff(n1,n2));
        System.out.println(minAbsoluteSumDiff2(n1,n2));
    }

}
