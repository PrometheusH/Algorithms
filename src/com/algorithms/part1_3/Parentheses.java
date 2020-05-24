package com.algorithms.part1_3;

import com.algorithms.stdlib.StdIn;

/**
 * 一个Stack用例，判断括号使用是否正确
 * 本书中用例是带main方法的！
 */
public class Parentheses {
    /**
     * 括号种类：(){}[]
     * 不正确的括号使用方式：
     * （[)]:交错了
     * ({}[])：小括号包含大括号--先不实现这个
     * {[])：左右括号不匹配
     * {[]：少了右括号
     * ()}:少了左括号
     *
     * 正确的：
     * {(()())}
     * 总结：
     * 加深Stack的理解，最经典的例子
     * split("")，是将字符串切分成字符，字符以字符串的形式存在在数组中
     * 读入一行readString()
     * @param args
     */
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        while (!StdIn.isEmpty()){
            String line = StdIn.readString();
            String[] spliters = line.split("");
            //关键点在于，符合哪些条件会弹出，符合哪些条件会压入
            for (String c:spliters){
                if (c.equals("}")){
                    if (!stack.isEmpty()){
                        String pop = stack.pop();
                        if (!pop.equals("{")){
                            System.out.println("false");
                            break;
                        }
                    }else {
                        System.out.println("false");
                        break;
                    }
                }else if(c.equals("]")){
                    if (!stack.isEmpty()){
                        String pop = stack.pop();
                        if (!pop.equals("[")){
                            System.out.println("false");
                            break;
                        }
                    }else {
                        System.out.println("false");
                        break;
                    }
                }else if(c.equals(")")){
                    if (!stack.isEmpty()){
                        String pop = stack.pop();
                        if (!pop.equals("(")){
                            System.out.println("false");

                            break;
                        }
                    }else {
                        System.out.println("false");

                        break;
                    }
                }else {
                    stack.push(c);
                }
            }

        }
    }
}
