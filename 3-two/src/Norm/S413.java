package Norm;// 22.3.31 413
// 等差数列划分

public class S413 {
    public static int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        if (n < 3) return 0;
        int ans = 0, tol = nums[1] - nums[0];
        int s = 0, e = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] - nums[i - 1] != tol) {

                if(e-s>=2)
                    ans+=(e-s-1)*(e-s)/2;
                tol = nums[i] - nums[i - 1];
                s = i-1;
            }

            e = i;
        }

        if(e-s>=2)
            ans+=(e-s-1)*(e-s)/2;
        return ans;
    }

    public static void main(String[] args){
        int n[]={1,2,3,8,9,10};
        System.out.println(numberOfArithmeticSlices(n));
    }
}
