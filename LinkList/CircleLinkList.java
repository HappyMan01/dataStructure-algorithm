package com.happyman;

/**
 * @author HappyMan
 * @version 0.1.0
 * @create 2021-05-18 15:32
 * @since 0.1.0
 **/
public class CircleLinkList {
    private DoubleLinkList.DoubleNode head;
    private int size;

   public void addToHead(int value) {
       DoubleLinkList.DoubleNode newDoubleNode = new DoubleLinkList.DoubleNode(value);
       if(this.head == null) {
           // link to  itself
           newDoubleNode.setNextNode(newDoubleNode);
           newDoubleNode.setPreNode(newDoubleNode);
           this.head = newDoubleNode;
       } else {
           // only a node(head)
           if(this.size == 1) {
              newDoubleNode.setNextNode(head);
              newDoubleNode.setPreNode(head);
              head.setPreNode(newDoubleNode);
              head.setNextNode(newDoubleNode);
           }else {
             DoubleLinkList.DoubleNode tempNode = head;
             while (tempNode.getNextNode() != head) {
                 tempNode = tempNode.getNextNode();
             }
               newDoubleNode.setNextNode(head);
               newDoubleNode.setPreNode(tempNode.getNextNode());
               head.setPreNode(newDoubleNode);
               tempNode.setNextNode(newDoubleNode);
           }
           this.head = newDoubleNode;
       }
       this.size++;
   }

public void addToTail(int value) {
    DoubleLinkList.DoubleNode newDoubleNode = new DoubleLinkList.DoubleNode(value);
        DoubleLinkList.DoubleNode p = head;
        while(p.getNextNode() != head) {
           p = p.getNextNode();
        }
    newDoubleNode.setPreNode(p.getNextNode());
    newDoubleNode.setNextNode(head);
    p.getNextNode().setNextNode(newDoubleNode);
    this.size++;
}

    public static void main(String[] args) {
        CircleLinkList circleLinkList = new CircleLinkList();
        circleLinkList.addToHead(1);
        System.out.println(circleLinkList.getHead().getValue()); // 1
        circleLinkList.addToHead(2);
        System.out.println(circleLinkList.getHead().getValue());// 2
        System.out.println(circleLinkList.getHead().getNextNode().getValue()); // 1
        circleLinkList.addToTail(3);
        System.out.println(circleLinkList.getHead().getNextNode().getValue()); // 3
    }

    public DoubleLinkList.DoubleNode getHead() {
        return head;
    }

    public void setHead(DoubleLinkList.DoubleNode head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
