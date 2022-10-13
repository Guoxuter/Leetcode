// 2022.5.4
// 乘积小于 K 的子数组
// 每日一题

package Daily2022_5;

public class S713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (nums.length == 1) {
            if (nums[0] < k) return 1;
            else return 0;
        }
        int i = 0, j = 0;
        int cur = 1, ans = 0;
        while (j < nums.length) {
            // 当当前乘积大于k，需要更进一步
            if (cur >= k) {
                ans += j - i - 1;
                cur /= nums[i];

                if (i>= j) {
                    cur*=nums[j];
                    j++;
                    i++;
                }
            } else {
                cur *= nums[j];
                j++;
            }
        }
        while (i < nums.length) {
            if (cur >= k) {
                ans += j - i - 1;
            } else {
                ans += j - i;
            }
            cur /= nums[i];
            i++;
        }

        return ans;


    }

    public int numSubarrayProductLessThanK2(int[] nums, int k) {
        if(k<=1)return 0;
        int ans=0;
        for(int i=0,j=0,cur=1;j<nums.length;j++){
            cur *= nums[j];
            while(cur>=k)cur/=nums[i++];
            ans+=j-i+1;
        }
        return ans;
    }
}
