package Simulation;
// 31下一个排列
/*
实现获取 下一个排列 的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列（即，组合出下一个更大的整数）。
        如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
        必须 原地 修改，只允许使用额外常数空间。*/

public class S31 {
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int start = -1;
        int lst = 0;
        // 查看是否有字典序更大的出现
        for (int i = n - 1; i >= 0; i--) {
            if (lst > nums[i]) {
                start = i;
                break;
            }
            lst = nums[i];

        }
        // 交换
        if (start >= 0) {
            lst = nums[start];

            for (int i = n - 1; i > start; i--) {

                if (lst<nums[i]){
                    // System.out.print(start+"  "+i);
                    swap(nums,start,i);
                    break;
                }
            }
        }

        reverse(nums,start+1,n-1);
    }

    static void reverse(int[] nums, int a, int b) {

        int l = a, r = b;
        while (l < r) {
            swap(nums, l++, r--);
        }
    }

    static void swap(int[] nums, int a, int b) {
        int c = nums[a];
        nums[a] = nums[b];
        nums[b] = c;
    }


    public static void main(String[] args) {
        int[] n = new int[]{2,5,4,3,1};
        nextPermutation(n);
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }


}
