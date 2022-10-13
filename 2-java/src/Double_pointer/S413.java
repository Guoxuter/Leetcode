package Double_pointer;

// 11.6 1
// 等差数列划分
public class S413 {
    public static int numberOfArithmeticSlices(int[] nums) {
        // d为公差 count为总数 n为当前公差一致的数字数
        int d = 0, count = 0, n = 0, j = 0;
        int las, cur;
        int[] ns = new int[nums.length];

        for (int i = 0; i < nums.length - 1; i++) {
            las = nums[i];
            cur = nums[i + 1];
            if (i == 0) {
                d = cur - las;
                n = 2;
            } else {
                if (d != cur - las) {
                    d = cur - las;
                    ns[j++] = n;
                    n = 2;
                } else {
                    n += 1;
                }
            }
            System.out.println(las + "__" + cur + "__" + d + "__" + n + "__" + ns);

        }
        ns[j++] = n;

        for (int i = 0; i < ns.length; i++) {
            cur = ns[i]-2;
            if (cur >0)
                count += cur * (cur + 1) / 2;
        }

        return count;


    }

    public int numberOfArithmeticSlices2(int[] nums) {
        // 别人写的简洁代码，拿来学习
        int n = nums.length;
        if (n < 3) return 0;
        int[] dp = new int[n]; //以nums[i]结尾的等差数列个数
        int ans = 0;
        for (int i = 2; i < n; i++) {
            if (nums[i - 1] * 2 == nums[i - 2] + nums[i]) dp[i] = dp[i - 1] + 1;
            ans += dp[i];
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] n = new int[]{1, 2, 3};
        System.out.println(numberOfArithmeticSlices(n));
    }
}
