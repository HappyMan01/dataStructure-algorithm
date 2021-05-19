package com.happyman;

import javax.annotation.sql.DataSourceDefinition;

/** singleLinkList operation
 * @author HappyMan
 * @version 0.1.0
 * @create 2021-05-17 12:57
 * @since 0.1.0
 **/

public class SingleLinkList {
    private Node head;// head node
    private int size; // length

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    /**
     * add node to head
     * @param a value of node
     */
    public void addToHead(int a) {
        Node node = new Node(a);
        if(head != null) {
            node.setNextNode(head);
        }
        head = node;
        this.size++;
    }

    /**
     * add node to last
     * @param value value of node
     */
    public void addToTrail(int value) {
        Node newNode = new Node(value);
        if(head == null) {
           head = newNode;
        }else {
            Node temp = head;
            while (temp.getNextNode() != null) {
               temp = temp.getNextNode();
            }
            temp.setNextNode(newNode);
            newNode.setNextNode(null);
        }
        this.size++;
    }

    /**
     * insert value after one node
     * @param value value of  target node
     */
    public void insetAfter(int value,int targetValue) {
        Node node = new Node(value);
        Node p= head;
        while (p.getNextNode() != null) {
            // seek for target node
           if(p.getData() == targetValue) {
               // target node's next assign newNode's next
               node.setNextNode(p.getNextNode());
               // target node's next node is assigned for newNode
               p.setNextNode(node);
               break;
           }
            p = p.getNextNode();
        }
        this.size++;
    }

    public void insertBefore(int value,int targetValue) {
        Node newNode = new Node(value);
        Node temp = head;
        while (temp.getNextNode() != null) {
           if(temp.getNextNode().getData() == targetValue) {
              newNode.setNextNode(temp.getNextNode());
              temp.setNextNode(newNode);
              break;
           }
           temp = temp.getNextNode();
        }
        this.size++;
    }

    /**
     * print singleLinkList
     * @param singleLinkList
     */
    public void display(SingleLinkList singleLinkList) {
        Node head = singleLinkList.head;
        if(head == null) {
            System.out.println("current plain-list is empty");
        }
        while (head != null) {
            System.out.printf("%d->",head.getData());
            head = head.getNextNode();
        }
        System.out.println();
    }

    /**
     * implement for LRU(Least Recently used) algorithm
     */
    public void lruAlgorithm (SingleLinkList singleLinkList){
        singleLinkList.addToHead(5);
        singleLinkList.addToTrail(4);
        singleLinkList.addToTrail(3);
        // if non-value of singleLinkList
            // add to head
        // if existed of singleLinkList
            // delete old node
            // add to head
    }

    public static void main(String[] args) {
        SingleLinkList singleLinkList = new SingleLinkList();
        singleLinkList.display(singleLinkList);
        singleLinkList.addToHead(1);
        System.out.printf("length of plain-list  %d",singleLinkList.size);
        System.out.println();
        singleLinkList.display(singleLinkList);
        singleLinkList.addToHead(2);
        System.out.printf("length of plain-list %d",singleLinkList.size);
        System.out.println();
        singleLinkList.display(singleLinkList);
        singleLinkList.addToHead(3);
        System.out.printf("length of plain-list %d",singleLinkList.size);
        System.out.println();
        singleLinkList.display(singleLinkList);
        singleLinkList.addToTrail(0);
        System.out.printf("length of plain-list %d",singleLinkList.size);
        System.out.println();
        singleLinkList.display(singleLinkList);
        singleLinkList.insetAfter(5,3);
        System.out.printf("length of plain-list %d",singleLinkList.size);
        System.out.println();
        singleLinkList.display(singleLinkList);
        singleLinkList.insertBefore(6,2);
        System.out.printf("length of plain-list %d",singleLinkList.size);
        System.out.println();
        singleLinkList.display(singleLinkList);
    }
}
