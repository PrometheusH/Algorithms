package com.algorithms.part2_1;

import com.algorithms.stdlib.In;
import com.algorithms.stdlib.StdOut;

/**
 * 排序算法类的模板
 */
public class Example {
    public static void sort(Comparable[] a){

    }
    public static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }
    public static void exch(Comparable[] a,int i,int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public static void  show(Comparable[] a){
        for (int i=0;i<a.length;i++){
            StdOut.print(a[i]+" ");
        }
        StdOut.println();
    }

    public static  boolean isSorted(Comparable[] a){
        for (int i=0;i<a.length;i++){
            if (less(a[i],a[i+1])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] a = In.readStrings();
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
