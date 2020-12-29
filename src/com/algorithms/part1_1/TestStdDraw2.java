package com.algorithms.part1_1;

import com.algorithms.stdlib.StdDraw;

public class TestStdDraw2 {
    public static void main(String[] args) {
        int N=30;
        StdDraw.setXscale(0,50);
        StdDraw.setYscale(0,100);
        StdDraw.setPenRadius(.01);
        for (int i=1;i<=N;i++){
            //y=x
            StdDraw.point(i,i);
            StdDraw.point(i,i*i);
            StdDraw.point(i,Math.log(i)+10);

        }
    }
}
