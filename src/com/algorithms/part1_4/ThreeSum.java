package com.algorithms.part1_4;

public class ThreeSum {
    public static int count(int[] a){
        //统计和为0的元祖数量
        int N = a.length;
        int cnt=0;
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                for (int k=0;k<N;k++){
                    if (a[i]+a[j]+a[k]==0)
                        cnt++;
                }
            }
        }
        return cnt;
    }
}
