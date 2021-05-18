package com.happyman;

/**
 *  implement of singleLinkList
 * @author HappyMan
 * @version 0.1.0
 * @create 2021-05-17 12:55
 * @since 0.1.0
 **/
public class Node {
   private int data;
   private Node nextNode;

   public Node(int data) {
      this.data = data;
   }

   public int getData() {
      return data;
   }

   public void setData(int data) {
      this.data = data;
   }

   public Node getNextNode() {
      return nextNode;
   }

   public void setNextNode(Node nextNode) {
      this.nextNode = nextNode;
   }

   @Override
   public String toString() {
      return "Node{" +
              "data=" + data +
              ", nextNode=" + nextNode +
              '}';
   }
}
