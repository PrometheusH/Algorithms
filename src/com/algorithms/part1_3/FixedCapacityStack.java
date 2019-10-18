package com.algorithms.part1_3;

import java.util.Objects;

/**
 * 泛型定容栈，OfString是String类型的定容栈
 */

public class FixedCapacityStack<T>{
    private T[] arr;
    private int N;

    public FixedCapacityStack(int cap){
        arr = (T[])new Object[cap];
    }

    public boolean isEmpty(){
        return N==0;
    }

    public int size(){
        return N;
    }

    public void push(T item){
        arr[N++] = item;
    }

    public T pop(){
        return arr[--N];
    }
}
