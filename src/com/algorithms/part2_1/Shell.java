package com.algorithms.part2_1;

import com.algorithms.stdlib.StdOut;

public class Shell {
    public static void sort(Comparable[] a){
//        for (int d=4;d>0;d=d/2){
//            for (int i=0;i<d;i++){
//                for (int j=i;j<a.length-d;j=j+d){
//                    for (int k=j;k>=d&&less(a[k],a[k-d]);k=k-d){
//                        exch(a,k,k-d);
//                    }
//                }
//            }
//        }
        int N=a.length;
        int h = 1;
        while (h<N/4) h = 4*h+1;

        while (h>=1){
            for (int i=h;i<N;i++){//从第h个开始每个与自己前面每间隔h个所有的相比较，而我上面是一组一组做的（先将h，2h，3h排好，再排h+1，2h+1）
                for (int j=i;j>=h&&less(a[j],a[j-h]);j=j-h){
                    exch(a,j,j-h);
                }
            }
            System.out.println(h);
            h=h/4;
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
