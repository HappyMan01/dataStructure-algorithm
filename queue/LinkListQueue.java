package com.happyman;

/**
 * @author HappyMan
 * @version 0.1.0
 * @create 2021-05-31 15:53
 * @since 0.1.0
 **/
public class LinkListQueue {
    // head node
    private Node head;
    // head tail
    private Node tail;


    // 入队
    public void in(int a) {
        Node node = new Node(a);
        if (tail == null) {
            tail = node;
            head = node;
        } else {
            tail.setNextNode(node);
            tail = tail.getNextNode();
        }
    }

    // 出队
    public Integer out() {
        if (head == null) return  null;
        int data = head.getData();
        head = head.getNextNode();
        return  data;
    }

    public void printAll() {
        Node p = head;
        while (p != null) {
            System.out.println(p.getData());
            p = p.getNextNode();
        }
        System.out.println();

    }
    public static void main(String[] args) {
        LinkListQueue linkListQueue = new LinkListQueue();
        linkListQueue.in(1);
        linkListQueue.in(2);
        linkListQueue.in(3);
        linkListQueue.printAll();
        System.out.println(3 % 8);
    }
}
