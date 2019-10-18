package com.algorithms.part1_3;

import com.zjh.algorithms.StdOut;

import java.util.Objects;

/**
 * 下压(LIFO)栈
 * 总结：
 * 十分重要的算法，它几乎达到了任意集合类数据类型的实现的最佳性能：
 * 1.每项操作的用时都与集合大小无关
 * 2.空间需求总是不超过集合大小乘以一个常数
 *
 * 与定容栈不同的是：
 * 1.在声明存储元素的数组的时候已经初始化成了大小为1的数组，而定容栈是没有初始化的，是根据外部传进来的容量进行初始化
 * 2. 由于1，也就没有根据容量初始化的构造方法
 * 3.多了Resizing方法
 * 4. pop和push各自有对容量改变的操作
 *
 * pop方法是先扩容，再压入
 * push方法是先弹出，再缩容，当元素个数是容量的1/4时，缩容为1/2
 *
 */
public class ResizingArrayStack<Item> {
    private Item[] arr= (Item[]) new Object[1];
    private int N;

    public boolean isEmpty(){
        return N==0;
    }

    public int size(){
        return N;
    }

    /**
     * 将栈移动到一个大小为max的新数组
     * @param max
     */
    private void resize(int max){
        StdOut.println("此时数组元素个数N为："+N+"，数组容量为："+arr.length+"，叮咚，现在已经将数组容量改变为："+max);
        Item[] temp = (Item[])new Object[max];
        for (int i=0;i<N;i++){
            temp[i] = arr[i];
        }
        arr = temp;
    }

    public void push(Item item){
        if (N== arr.length) resize(2* arr.length);
        arr[N++]=item;
    }

    public Item pop(){
        Item item = arr[--N];
        //我觉得这一步没有必要，因为数组的大小是一定的是一整块内存，即使设置为了null，也不会回收
        arr[N]=null;//避免对象游离
        //N为什么要大于0？因为N等于0，进来的时候N一定是为1的，
        //N为1的时候，arr.length为4，现在arr.length一定为2，会执行resize，而max=0，会导致数组越界异常
        if (N>0&&N==arr.length/4) resize(arr.length/2);
        return item;
    }

}
