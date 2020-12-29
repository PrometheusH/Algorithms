package com.algorithms.part1_1;

import com.algorithms.stdlib.StdDraw;

public class TestStdDraw {
    public static void main(String[] args) {
        //设置笔的宽度
        StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.point(0.5,0.5);
        StdDraw.setPenColor(StdDraw.MAGENTA);
        StdDraw.line(0.2,0.2,0.8,0.2);
    }
}
