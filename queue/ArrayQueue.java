package com.happyman;

/**
 * 数组实现队列操作
 * @author HappyMan
 * @version 0.1.0
 * @create 2021-05-31 14:05
 * @since 0.1.0
 **/
public class ArrayQueue {
    // store container
    private String[] items;
    // count
    private int count = 0;
    // index of head
    private int head = 0;
    // index of tail
    private int tail = 0;

    public ArrayQueue(int capacity){
       items = new String[capacity];
       this.count = capacity;
    }

    // 入队
    public boolean in(String item) {
        if(tail == count) {
            if(head == 0) return false;
            for (int i = head; i <= tail; i++) {
               items[i - head] = items[i];
            }
            head = 0;
            tail -= head;
        }
        items[tail] = item;
        ++tail;
        return true;
    }

    // 出队
    public String out() {
        if(head == tail) return null;
        String headElement = items[head];
        ++head;
        return headElement;
    }

    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
        arrayQueue.in("happy");
        arrayQueue.in("man");
        String out = arrayQueue.out();
        System.out.println(out);
        System.out.println(arrayQueue.out());
    }
}
