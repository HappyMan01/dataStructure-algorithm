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
         newNode.setNextNode(head);
         head.setPreNode(newNode);
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
   public void insertAfter(int value,int targetValue) {
       DoubleNode newDoubleNode = new DoubleNode(value);
       DoubleNode p = head;
       boolean b = p.getNextNode() != null;
       if(b) {
           while (true) {
               if(p.getNextNode().getValue() == targetValue ) {
                   // 首先设置newNode
                   // 然后设置other node
                   newDoubleNode.setPreNode(p.getNextNode());
                   newDoubleNode.setNextNode(p.getNextNode().getNextNode());
                   p.getNextNode().setNextNode(newDoubleNode);
                   p.getNextNode().getNextNode().setPreNode(newDoubleNode);
                   break;
               }
               p = p.getNextNode();
           }
       }else{
           head.setNextNode(newDoubleNode);
           newDoubleNode.setPreNode(head);
       }


   }

   public void printAll(DoubleLinkList doubleLinkList) {
       if(doubleLinkList.head == null) {
           System.out.println("doubleLinkList is empty");
       }else {
          DoubleNode temp = doubleLinkList.head;
          while (temp != null) {
              System.out.printf("%d<->",temp.getValue());
              temp = temp.getNextNode();
          }
       }
       System.out.println();
   }

    public static void main(String[] args) {
        DoubleLinkList doubleLinkList = new DoubleLinkList();
        doubleLinkList.printAll(doubleLinkList);
        doubleLinkList.addToHead(4);
        doubleLinkList.printAll(doubleLinkList);
        doubleLinkList.addToHead(5);
        doubleLinkList.printAll(doubleLinkList);
        doubleLinkList.addToTrail(3);
        doubleLinkList.printAll(doubleLinkList);
        doubleLinkList.insertAfter(6,4);
        doubleLinkList.printAll(doubleLinkList);
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
