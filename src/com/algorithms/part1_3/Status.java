package com.algorithms.part1_3;
import com.zjh.algorithms.Draw;
import com.zjh.algorithms.In;
import com.zjh.algorithms.StdIn;
import com.zjh.algorithms.StdOut;

import java.util.Queue;

public class Status {
    public static void main(String[] args) {

        //测试定容栈
//        FixedCapacityStackOfStrings fcss = new FixedCapacityStackOfStrings(100);
//        while (!StdIn.isEmpty()){
//            String item = StdIn.readString();
//            if (!item.equals("-")){
//                fcss.push(item);
//            }else if (!fcss.isEmpty()){
//                StdOut.print(fcss.pop()+" ");
//            }
//            StdOut.println("("+ fcss.size()+" left on stack)");
//        }

        //测试泛型定容栈：
//        FixedCapacityStack<Integer> fcs = new FixedCapacityStack<>(100);
//        while (!StdIn.isEmpty()){
//            int item = StdIn.readInt();
//            if (item!=-1){
//                fcs.push(item);
//            }else if (!fcs.isEmpty()){
//                StdOut.print(fcs.pop()+" ");
//            }
//            StdOut.println("("+ fcs.size()+" left on stack)");
//        }


//        ResizingArrayStack<String> ras = new ResizingArrayStack<>();
//        while (!StdIn.isEmpty()){
//            String item = StdIn.readString();
//            if (!item.equals("-")){
//                ras.push(item);
//                //这里保证了当N==0时不执行pop操作
//            }else if (!ras.isEmpty()){
//                StdOut.print(ras.pop()+" ");
//            }
//            StdOut.println("("+ ras.size()+" left on stack)");
//            StdOut.println("====================================");
//        }


        //从标准输入中读取一个文本流，用栈判断其中的括号是否完整

    }



}

