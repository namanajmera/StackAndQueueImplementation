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

    @Test
    public void given3NumberInStackWhenPoppedShouldMatchedLastAddedNode() {
        MyNode<Integer> firstNode = new MyNode(70);
        MyNode<Integer> secondNode = new MyNode(30);
        MyNode<Integer> thirdNode = new MyNode(56);

        MyStack myStack = new MyStack();
        myStack.push(firstNode);
        myStack.push(secondNode);
        myStack.push(thirdNode);

        AllNode poppedNode = myStack.pop();
        myStack.printStack();
        Assertions.assertEquals(thirdNode, poppedNode);
    }

    @Test
    public void given3NumberInStackWhenPoppedAllShouldBeEmpty() {
        MyNode<Integer> firstNode = new MyNode(70);
        MyNode<Integer> secondNode = new MyNode(30);
        MyNode<Integer> thirdNode = new MyNode(56);

        MyStack myStack = new MyStack();
        myStack.push(firstNode);
        myStack.push(secondNode);
        myStack.push(thirdNode);

        AllNode poppedLastNode = myStack.pop();
        AllNode poppedSecondLastNode = myStack.pop();
        AllNode poppedFirstNode = myStack.pop();

        Assertions.assertTrue(myStack.isEmpty());
    }
}
