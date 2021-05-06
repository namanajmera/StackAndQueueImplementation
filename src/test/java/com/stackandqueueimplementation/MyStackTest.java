package com.stackandqueueimplementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyStackTest {
    @Test
    public void given3NumberWhenAddedToStackShouldHaveLastAddedNodeAtTop() {
        MyNode<Integer> firstNode = new MyNode(70);
        MyNode<Integer> secondNode = new MyNode(30);
        MyNode<Integer> thirdNode = new MyNode(56);

        MyStack myStack = new MyStack();
        myStack.push(firstNode);
        myStack.push(secondNode);
        myStack.push(thirdNode);

        AllNode top=myStack.peek();
        myStack.printStack();

        Assertions.assertEquals(thirdNode,top);
    }
}
