package com.algorithms.part2_1;

import com.algorithms.stdlib.StdOut;

public class Insertion {
    public static void sort(Comparable[] a){
        for (int i=0;i<a.length-1;i++){
//            for (int j=i+1;j<a.length;j++){
//                for (int k=j-1;k>=0;k--){
//                    if (less(a[j],a[k])){
//                        exch(a,j,k);
//                        continue;
//                    }
//                }
//            }
            for (int j=i;j>0&&less(a[j],a[j-1]);j--){
                exch(a,j,j-1);
            }
        }
    }

    public static void main(String[] args) {
        String[] a = {"12","23","41","62","35","12","67","34","66","39","67","11","26","44","77"};
        sort(a);
        show(a);
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
}
