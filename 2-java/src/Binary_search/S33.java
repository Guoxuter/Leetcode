package Binary_search;

// 11.11 10
// 搜索旋转排序数组
public class S33 {
    public static int search(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) return -1;
        if (n == 1) return nums[0] == target ? 0 : -1;


        int mid=0,i=0,j=n-1;
        while(i<j){
            mid=i+j+1>>1;
            if(nums[mid]>=nums[0])i=mid;
            else j=mid-1;
        }
        //System.out.println("i="+i+" j="+j+" mid="+mid);
        if(target>nums[0])i=0;
        else if(target==nums[0])return 0;
        else{i=i+1;j=n-1;}
        //System.out.println("i="+i+" j="+j+" mid="+mid);

        while(i<j){
            mid=i+j>>1;
            if(nums[mid]>target)j=mid;
            else if(nums[mid]==target)return mid;
            else i=mid+1;
        }
        //System.out.println("i="+i+" j="+j+" mid="+mid);
        //System.out.println("________________");
        return nums[j] == target ? j:-1;


    }
    public static int search2(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) return -1;
        if (n == 1) return nums[0] == target ? 0 : -1;
        int mid=0;
        // 第一次「二分」：从中间开始找，找到满足 >=nums[0] 的分割点（旋转点）
        int l = 0, r = n - 1;
        while (l < r) {
            mid = l + r + 1 >> 1;
            if (nums[mid] >= nums[0]) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        System.out.println("i="+l+" j="+r+" mid="+mid);
        // 第二次「二分」：通过和 nums[0] 进行比较，得知 target 是在旋转点的左边还是右边
        if (target >= nums[0]) {
            l = 0;
        } else {
            l = l + 1;
            r = n - 1;
        }
        System.out.println("i="+l+" j="+r+" mid="+mid);
        while (l < r) {
            mid = l + r >> 1;
            if (nums[mid] >= target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        System.out.println("i="+l+" j="+r+" mid="+mid);
        //System.out.println(nums[r] == target);

        return nums[r] == target ? r : -1;
    }

    public static void main(String[] args){
        int[] n=new int[]{1,3};
        int k=3;
        System.out.println(search(n,k));
        System.out.println(search2(n,k));
    }
}
