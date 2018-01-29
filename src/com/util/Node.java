package com.util;

import java.util.Objects;

public class Node
{
    protected int value;
    protected Node next;

    public Node()
    {
        next = null;
        value = 0;
    }

    public Node(int d,Node n)
    {
        value = d;
        next = n;
    }

    public Node getNext()
    {
        return next;
    }
    public void setNext(Node n)
    {
        next = n;
    }

    public void setValue(int d)
    {
        value = d;
    }

    public int getValue()
    {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return value == node.value &&
                Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {

        return Objects.hash(value, next);
    }
}