package com.algorithms.part1_3;

/**
 * 定容栈
 * 总结：
 * 定容栈2个属性项，分别存的是数据和元素个数（不要与定容栈大小混淆了）
 * 4个方法，分别是判空，大小，压栈和出栈
 * 注意++ --的使用
 * N指向没有元素的位置
 *
 * 我的问题：越界了怎么防止？？
 * 回答：isEmpty防止没有元素了还使用pop方法，size防止越界访问数组和防止到了容量还push
 *
 */
public class FixedCapacityStackOfStrings {
    private String[] a;
    private int N;
    public FixedCapacityStackOfStrings(int cap){
        a=new String[cap];
    }

    /**
     * 定容栈是否为空
     * @return true：为空，false：不为空
     */
    public boolean isEmpty(){
        return N==0;
    }

    /**
     * 定容栈的大小
     * @return 整数：定容栈的大小
     */
    public int size(){
        return N;
    }

    /**
     * 压栈
     * @param item：压入元素
     */
    public void push(String item){
        //N++：先用N的值，再让N加一，N永远指向最后一个元素的下一个位置（没有元素）
        a[N++]=item;
    }

    /**
     * 出栈
     * @return 最后一个压入元素
     */
    public String pop(){
        //N--：先让N的值减一，再用N的值
        return a[--N];
    }

    /**
     * 定容栈是否已满
     * @return
     */
    public boolean isFull(){
        return N==a.length;
    }
}
