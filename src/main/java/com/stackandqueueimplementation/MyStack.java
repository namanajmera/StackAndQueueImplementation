package com.stackandqueueimplementation;

public class MyStack {
    private final MyLinkedList myLinkedList;

    public MyStack() {
        this.myLinkedList =new MyLinkedList();
    }

    public void push(AllNode newNode) {
        myLinkedList.add(newNode);

    }

    public void printStack() {
        myLinkedList.printMyList();

    }

    public AllNode peek() {
        return myLinkedList.getHead();
    }
}
