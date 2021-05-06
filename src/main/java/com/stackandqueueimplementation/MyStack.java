package com.stackandqueueimplementation;

public class MyStack {
    private final MyLinkedList myLinkedList;

    public MyStack() {
        this.myLinkedList = new MyLinkedList();
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

    public AllNode pop() {
        AllNode poppedNode = myLinkedList.deleteTop();
        return poppedNode;
    }

    public boolean isEmpty() {
        if (size() == 0)
            return true;
        else
            return false;
    }

    public int size() {
        int size = 0;
        size = myLinkedList.size();
        return size;
    }
}
