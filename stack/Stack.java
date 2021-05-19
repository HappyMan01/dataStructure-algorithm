package com.happyman;

import java.sql.Statement;

/**
 *  implement stack operation
 * @author HappyMan
 * @version 0.1.0
 * @create 2021-05-19 12:52
 * @since 0.1.0
 **/
public class Stack {
    // state
        // size
    private int capacity;
        // container
    private int[] container;

    private int count = 0;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.container = new int[capacity];
    }

    // behavior
      // push
    public boolean push(int element) {
        container[count] = element;
        count++;
        return true;
    }
      // pop
    public int pop() {
        if(count != 0) {
            int element = container[count - 1];
            count--;
            return element;
        }
        return  -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(3);
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop()); // 2
        System.out.println(stack.pop()); // 1
    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int[] getContainer() {
        return container;
    }

    public void setContainer(int[] container) {
        this.container = container;
    }
}
