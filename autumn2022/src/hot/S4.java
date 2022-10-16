// 2022.10.13
package hot;

public class S4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length;
        int target= m+n;

        if (target % 2 == 1) {
            int midIndex = target / 2;
            double median = getKth(nums1, nums2, midIndex + 1);
            return median;
        } else {
            int midIndex1 = target / 2 - 1, midIndex2 = target / 2;
            double median = (getKth(nums1, nums2, midIndex1 + 1) + getKth(nums1, nums2, midIndex2 + 1)) / 2.0;
            return median;
        }

    }

    public double getKth(int[] nums1, int[] nums2,int k){
        int m=nums1.length,n=nums2.length;
        int index1=0,index2=0;

        int kth=0;
        while(true){

            if(index1==m)return nums2[index2+k-1];
            if(index2==n)return nums1[index1+k-1];
            if(k==1)return Math.min(nums1[index1],nums2[index2]);

            int mid=k/2;
            int new_index1=Math.min(index1+mid,m)-1;
            int new_index2=Math.min(index2+mid,n)-1;
            int piv1=nums1[new_index1],piv2=nums2[new_index2];
            if(piv1<piv2){
                k-=new_index1-index1+1;
                index1=new_index1+1;
            }
            else{
                k-=new_index2-index2+1;
                index2=new_index2+1;
            }

        }
    }
}