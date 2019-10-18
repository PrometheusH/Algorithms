package com.algorithms.part1_3;

import java.util.Iterator;

/**
 * 队列：
 * 先进先出
 * 向表尾添加元素，从表头删除元素，这个顺序一定不要颠倒了，否则很难实现
 * @param <Item>
 */
public class Queue<Item> implements Iterable{

    @Override
    public Iterator iterator() {
        return null;
    }

    private class QueueIterator implements Iterator<Item>{
        private Node current = first;
        @Override
        public boolean hasNext() {
            return current!=null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    private class Node{
        Item item ;
        Node next;
    }

    private Node first;
    private Node last;
    private int N;

    public boolean isEmpty(){return first==null;}//或N==0
    public void enqueue(Item item){
        //向表尾添加元素
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        //刚开始的时候，first和last都是指向null的，向表尾添加元素后，
        // last指向了一个节点，这时候应该让first也指向这个节点
        if (isEmpty()) first = last;
        else oldLast.next = last;
        N++;
    }

    public Item dequeue(){
        //从表头删除元素
        Item item = first.item;
        first = first.next;
        //正在删除最后一个元素，first和last都指向了最后一个元素
        // ，此时不能只改first的指针而不改last的
        if(isEmpty()) last=null;
        N--;
        return item;
    }

}
