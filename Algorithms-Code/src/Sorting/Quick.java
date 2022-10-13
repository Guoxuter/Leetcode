package Sorting;

import javax.xml.stream.events.StartDocument;

public class Quick {

    public static void sort(Comparable[] a){
        sort(a,0,a.length-1);
    }

    private static void sort(Comparable[]a,int lo,int hi){
        if(hi<=lo)return;
        int j=partition(a,lo,hi);

        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }


    // 快速排序的切分
    private static int partition(Comparable[] a,int lo,int hi){
        int i=lo,j=hi+1;
        Comparable v=a[lo];
        while(true){
            while(less(a[++i],v))if (i==hi)break;
            while(less(v,a[--j]))if (j==lo)break;
            if(i>=j)break;
            exch(a,i,j);
        }
        exch(a,lo,j);

        return j;
    }



    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w)<0;
    }

    private static void exch(Comparable[] a,int i,int j){
        Comparable t=a[i];
        a[i]=a[j];
        a[j]=t;
    }

    private static void show(Comparable[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a){
        for(int i=1;i<a.length;i++){
            if(less(a[i],a[i-1])) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Integer[] a={342,4,2,10,25,123,33,11,143,65,87,47,43};
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
