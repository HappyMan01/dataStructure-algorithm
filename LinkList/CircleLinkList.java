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
           newDoubleNode.setNextNode(newDoubleNode);
           newDoubleNode.setPreNode(newDoubleNode);
       } else {
         newDoubleNode.setNextNode(head);
         newDoubleNode.setPreNode(head.getPreNode());
         head.setPreNode(newDoubleNode);
       }
       this.head = newDoubleNode;
       this.size++;
   }

public void addToTail(int value) {
    DoubleLinkList.DoubleNode newDoubleNode = new DoubleLinkList.DoubleNode(value);
    if(this.head == null) {
        head = newDoubleNode;
        head.setNextNode(newDoubleNode);
        head.setPreNode(newDoubleNode);
    } else {
       DoubleLinkList.DoubleNode temp = head;
       while (temp.getNextNode() == head) {
          newDoubleNode.setPreNode(temp.getNextNode());
          newDoubleNode.setNextNode(head);
          temp.getNextNode().setNextNode(newDoubleNode);
          return;
       }
        temp = temp.getNextNode();
    }
}
public void printAll(CircleLinkList c) {
   if(c.head == null) {
       System.out.println("circleLinkList is empty");
   }else {
       DoubleLinkList.DoubleNode p = head;
       while (p.getNextNode() != head) {
           System.out.printf("%d=",p.getValue());
       }
       p = p.getNextNode();
   }
}

    public static void main(String[] args) {
        CircleLinkList circleLinkList = new CircleLinkList();
        circleLinkList.printAll(circleLinkList);
        circleLinkList.addToHead(1);
        circleLinkList.printAll(circleLinkList);
        circleLinkList.addToTail(2);
        circleLinkList.printAll(circleLinkList);
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
