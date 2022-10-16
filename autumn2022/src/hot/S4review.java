package hot;

public class S4review {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int t=nums1.length+nums2.length;
        int m=t/2;
        double median;
        if(t%2==1){
            median=getKth(nums1,nums2,m);
        }
        else{
            median=(getKth(nums1,nums2,m)+getKth(nums1,nums2,m-1))/2;
        }
        return median;
    }


    public double getKth(int[] nums1, int[] nums2,int k) {
        int m=nums1.length,n=nums2.length;
        int index1=0,index2=0;

        while(true){
            if(index1==m)return nums2[index2+k-1];
            if(index2==n)return nums1[index1+k-1];
            if(k==1)return Math.min(nums1[index1],nums2[index2]);

            int mid=k/2;
            int ni1=Math.min(index1+mid,m)-1;
            int ni2=Math.min(index2+mid,n)-1;

            int piv1=nums1[ni1],piv2=nums2[ni2];
            if(piv1>piv2){
                k-=ni2-index2+1;
                index2=ni2+1;
            }
            else{
                k-=ni1-index1+1;
                index1=ni1+1;
            }
        }
    }
}
