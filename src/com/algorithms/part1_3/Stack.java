package com.algorithms.part1_3;

import java.util.Iterator;

/**
 * 下压堆栈（链表实现）
 * 链表是数组的一种重要的替代方式
 * 总结：
 * 向栈顶添加元素，从栈顶移除元素
 */
public class Stack<Item> implements Iterable<Item>{
    private Node first;
    private int N;

    private class Node{
        Item item;
        Node next;
    }

    private class StackIterator implements Iterator<Item>{
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

    @Override
    public Iterator<Item> iterator() {
        return new StackIterator();
    }

    public boolean isEmpty(){return first==null;}
    public int size(){return N;}
    public void push(Item item){
        //向栈顶添加元素
        Node oldFirst = first;
        first = new Node();
        first.item=item;
        first.next = oldFirst;
    }

    public Item pop(){
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }
}
