package com.algorithms.part1_3;


import java.lang.instrument.ClassDefinition;

/**
 * 链表
 * 链表的使用达到了我们的最优设计目标：
 * 1.它可以处理任意类型的数据
 * 2.所需空间总是和集合的大小成正比
 * 3.操作所需的时间总是和集合的大小无关
 */
public class NodeOpration {
    private static class Node<Item>{
        Item item;
        Node next;
    }
    public static void main(String[] args) {
        //构造链表
        Node first = new Node<String>();
        Node mid = new Node<String>();
        Node last = new Node<String>();
        first.item="to";
        mid.item="be";
        last.item ="or";
        first.next=mid;
        mid.next = last;

        //在表头插入节点
        Node oldFirst = first;
        first = new Node<String>();
        first.item = "oh";
        first.next=oldFirst;

        //在表尾插入节点
        Node oldLast = last;
        last = new Node<String>();
        last.item="not";
        oldLast.next=last;

        //链表遍历
        for (Node x = first;x!=null;x=x.next){
            System.out.println(x.item+"  ");
        }

        //删除一个指定的节点
        //在指定的节点前插入一个新节点
        //等等


    }

}
