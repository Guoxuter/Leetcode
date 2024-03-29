package Sorting;

public class Quick3way {

    public static void sort(Comparable[] a){
        sort(a,0,a.length-1);
    }

    private static void sort(Comparable[]a,int lo,int hi){
        if(hi<=lo)return;
        int lt=lo,i=lo+1,gt=hi;

        Comparable v=a[lo];
        while(i<=gt){
            int cmp=a[i].compareTo(v);
            if (cmp<0) exch(a,lt++,i++);
            else if(cmp>0)exch(a,i,gt--);
            else i++;
        }
        sort(a,lo,lt-1);
        sort(a,gt+1,hi);


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

