package com.algorithms.part1_1;

import com.algorithms.stdlib.StdDraw;
import com.algorithms.stdlib.StdRandom;

public class TestStdDraw3 {
    public static void main(String[] args) {
        int N=50;
        Double[] a = new Double[N];
        for (int i = 0;i<N;i++){
            a[i] = StdRandom.uniform();
        }
        for (int i=0;i<N;i++){
            double x = 1.0*i/N;
            double y = a[i]/2.0;
            double rw = 0.5/N;
            double rh = a[i]/2.0;
            StdDraw.filledRectangle(x,y,rw,rh);
        }
    }
}
