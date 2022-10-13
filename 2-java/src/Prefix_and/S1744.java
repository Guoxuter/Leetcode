package Prefix_and;

// 11.11 9
// 你能在你最喜欢的那天吃到你最喜欢的糖果吗
public class S1744 {
    static long[] sum;

    public static boolean[] canEat(int[] candiesCount, int[][] queries) {
        boolean[] ans = new boolean[queries.length];
        sum = new long[candiesCount.length + 1];

        for (int i = 1; i <= candiesCount.length; i++) {
            sum[i] = sum[i - 1] + candiesCount[i-1];
        }

        for (int i = 0; i < queries.length; i++) ans[i] = caneat(candiesCount, queries[i]);
        return ans;
    }

    public static boolean caneat(int[] candiesCount, int[] query) {
        long sum1 = 0, sum2 = 0;
        // 从第0天开始吃糖
        System.out.println("qurery[1]="+query[1]);
        sum1 = sum[query[0]] + 1;
        sum2 = sum[query[0] + 1];
        System.out.println(query[1] + "_" + (query[1]) * query[2]+"___"+sum1 + "_" + sum2);
        System.out.println();

        if (query[1] + 1 <= sum2 && (long) (query[1] + 1) * query[2] >= sum1) return true;
        return false;
    }



    public static void main(String[] args) {
        int[] n = new int[]{7, 4, 5, 3, 8};
        int[] q = new int[]{2,13,10000};





        sum = new long[n.length + 1];
        for (int i = 1; i < n.length; i++) {
            sum[i] = sum[i - 1] + n[i-1];
            System.out.print(sum[i]+" ");
        }
        System.out.println(caneat(n, q));

    }
}



