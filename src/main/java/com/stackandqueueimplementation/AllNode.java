package com.stackandqueueimplementation;

public interface AllNode<K> {
    public <K> K getKey();

    public void setKey(K key);

    public AllNode getNext();

    public void setNext(AllNode next);
}
