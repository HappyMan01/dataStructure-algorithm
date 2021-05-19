package com.happyman;

/** operate browser using stack
 * @author HappyMan
 * @version 0.1.0
 * @create 2021-05-19 14:40
 * @since 0.1.0
 **/
public class Browser {
    // page of browser
    private int page;

    // leftStack
    private Stack leftStack;

    // rightStack
    private Stack rightStack;

    public void goAhead() {
        int pop = this.rightStack.pop();
        this.leftStack.push(pop);
    }

    public void goBack() {
        int pop = this.leftStack.pop();
        this.rightStack.push(pop);
    }

    public void newPage(int page) {
       this.leftStack.push(page);
    }
    public int look(){
        return this.leftStack.pop();
    }

    public Browser() {
        this.leftStack = new Stack(3);
        this.rightStack = new Stack(3);
    }

    public static void main(String[] args) {
        Browser browser = new Browser();
        browser.newPage(1);
        browser.newPage(2);
        browser.newPage(3);
        int currentPage = browser.look();
        System.out.println(currentPage); // 3
        browser.goBack();
        int prePage = browser.look(); // 2
        System.out.println(prePage);
        browser.goAhead();
        int nextPage = browser.look();
        System.out.println(nextPage); // 3
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public Stack getLeftStack() {
        return leftStack;
    }

    public void setLeftStack(Stack leftStack) {
        this.leftStack = leftStack;
    }

    public Stack getRightStack() {
        return rightStack;
    }

    public void setRightStack(Stack rightStack) {
        this.rightStack = rightStack;
    }
}
