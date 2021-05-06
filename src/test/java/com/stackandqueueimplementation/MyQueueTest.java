package com.stackandqueueimplementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyQueueTest {
    @Test
    public void given3NumberWhenAddedToQueueShouldHaveFirstAddedNodeAtTop() {
        MyNode<Integer> firstNode = new MyNode(56);
        MyNode<Integer> secondNode = new MyNode(30);
        MyNode<Integer> thirdNode = new MyNode(70);

        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(firstNode);
        myQueue.enqueue(secondNode);
        myQueue.enqueue(thirdNode);

        AllNode top = myQueue.peek();
        myQueue.printQueue();
        Assertions.assertEquals(firstNode, top);
    }
}
