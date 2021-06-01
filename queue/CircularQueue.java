package com.happyman;

/**
 * @author HappyMan
 * @version 0.1.0
 * @create 2021-06-01 09:45
 * @since 0.1.0
 **/
public class CircularQueue {
    private String[] items;
    private int n = 0;
    private int head = 0;
    private int tail = 0;

    public CircularQueue(int capacity) {
       items = new String[capacity];
       n = capacity;
    }

    // 入队
    public boolean in(String item) {
       // 如果队列满了
        if((tail + 1) % n == head) return false;
        items[tail] = item;
        tail = (tail + 1) % n;
        return true;
    }
    // 出队
    public String out() {
        if(head == tail) return null;
        String item = items[head];
        head = (head + 1) % n;
        return item;
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(4);
        circularQueue.in("1");
        circularQueue.in("2");
        circularQueue.in("3");
        System.out.println(circularQueue.out());
        System.out.println(circularQueue.out());
    }
}
