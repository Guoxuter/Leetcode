package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge {

    private static Comparable[] aux;

    // 原地归并排序
    public static void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;

        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        for (int k = lo; k <= hi; k++) {
            if (i > mid) a[k] = aux[i++];
            else if (j > hi) a[k] = aux[i++];
            else if (less(aux[j], aux[i])) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }

    // 自顶向下的归并排序
    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int mid = (lo + hi) / 2;
        sort(a, lo, mid);
        sort(a, mid+1, hi);
        merge(a, lo, mid, hi);
    }

    // 自底向上的归并排序
    public static void sort1(Comparable[] a) {
        int N=a.length;
        aux = new Comparable[N];
        for(int sz=1;sz<N;sz=sz+sz)
            for(int lo=0;lo<N-sz;lo+=sz+sz)
                merge(a,lo,lo+sz-1,Math.max(lo+sz+sz-1,N-1));
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // String[] a = {"ablzkgsdf", "bafgasg", "zdag", "abab", "zabc"};
        Integer[] a = {342, 4, 2, 10, 25, 123, 33, 11, 143, 65, 87, 47, 43};
        assert isSorted(a);
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
