package com.algorithms.part1_4;

import com.algorithms.stdlib.StdOut;
import com.algorithms.stdlib.StdRandom;

public class testMain {

    /*//测试ThreeSum在1000、2000、4000的运行时间，验证当输入为8000时的运行时间
    public static void main(String[] args) {

        int N = Integer.parseInt(args[0]);
        int[] a = new int[N];
        for (int i=0;i<N;i++){
            a[i] = StdRandom.uniform(-1000000,1000000);
        }
        Stopwatch timer = new Stopwatch();
        int cnt = ThreeSum.count(a);
        double time = timer.elapsedTime();
        StdOut.println(cnt+" triples "+time+" seconds");
        //372 triples 1.561 seconds
        //2838 triples 11.515 seconds
        //24177 triples 89.169 seconds

        //两边取lg：lg：以2为底的对数
        //lg1.561:0.642,,,,,,lg1000:9.965
        //lg11.515:3.525,,,,,,lg2000:10.965
        //lg89.169:6.478,,,,,lg4000:11.965
        //y,x
        //拟合直线为：y=2.917x-28.447--------lgT(N)=2.917*lgN-28.447-------lga=-28.447即a=1/2^28.447=2.732*10^-9-------T(N)=2.732*10^-9*N^2.917

        //8000时：190719 triples 767.329 seconds
        //2.732*10^-9*8000^2.917=668.428s，大致准确
    }*/


    public static void main(String[] args) {

    }
}
