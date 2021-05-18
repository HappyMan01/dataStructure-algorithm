package com.happyman;

/**
 *  double linkList operation
 * @author HappyMan
 * @version 0.1.0
 * @create 2021-05-18 10:32
 * @since 0.1.0
 **/
public class DoubleLinkList {
    private DoubleNode head;
    private int size;

    class DoubleNode {
       private int value;
       private DoubleNode nextNode;
       private DoubleNode preNode;

        public DoubleNode(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public DoubleNode getNextNode() {
            return nextNode;
        }

        public void setNextNode(DoubleNode nextNode) {
            this.nextNode = nextNode;
        }

        public DoubleNode getPreNode() {
            return preNode;
        }

        public void setPreNode(DoubleNode preNode) {
            this.preNode = preNode;
        }
    }
   public  void addToHead(int value) {
       DoubleNode newNode = new DoubleNode(value);
      if(head != null) {
         newNode.setNextNode(head.getNextNode());
      }
      this.head = newNode;
      this.size++;
   }
   public void addToTrail(int value) {
       DoubleNode newNode = new DoubleNode(value);
       if(head == null) {
           this.head = newNode;
       }else{
         DoubleNode temp = head;
          while (temp.getNextNode() != null) {
              temp = temp.getNextNode();
          }
         newNode.setNextNode(temp.getNextNode());
         newNode.setPreNode(temp);
         temp.setNextNode(newNode);
      }
       this.size++;
   }

   public void printAll(DoubleLinkList doubleLinkList) {
       if(this.head == null) {
           System.out.println("doubleLinkList is empty");
       }else {
          DoubleNode temp = this.head;
          while (temp.getNextNode() != null) {
              System.out.printf("doubleLinkList is ");
          }
       }
   }


    public DoubleNode getHead() {
        return head;
    }

    public void setHead(DoubleNode head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
