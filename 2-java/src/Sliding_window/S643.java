package Sliding_window;

// 11.11 4
//子数组最大平均数I
public class S643 {
    public static double findMaxAverage(int[] nums, int k) {
        double avg = 0, sum = 0; // -10^4 <= nums[i] <= 10^4
        for (int i = 0; i < k; i++) sum += nums[i];
        avg = sum / k;



        for (int i = k; i < nums.length; i++) {
            sum-=nums[i-k];
            sum+=nums[i];
            avg=Math.max(avg,sum/k);
        }
        return avg;
    }

    public static void main(String[] args) {
        int[] n = new int[]{1, 12, -5, -6, 50, 3};
        findMaxAverage(n, 4);
    }

}
