package com.util;

public class SinglyLinkedList {
    protected Node start;
    protected Node end;
    public int size;

    public SinglyLinkedList() {
        start = null;
        end = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void append(int val) {
        Node newNode = new Node(val, null);
        size++;
        if (start == null) {
            start = newNode;
            end = start;
        } else {
            end.setNext(newNode);
            end = newNode;
        }
    }

    public void deleteTail() {
        if(size == 0){
            return;
        } else if(size == 1){
            start = null;
            size = 0;
        } else {
            Node s = start;
            while(s.getNext() == end) {
                s = s.getNext();
            }
            s.setNext(null);
            end = s;
            size--;
        }

    }

    public void deleteGreaterThan(int value) {
        if(size == 0){
            return;
        } else {
            Node temp = start;
            while(temp != null && temp.getValue() == value) {
                temp = start.getNext();
                size--;
            }
            start = temp;
            if(start == null){
                return;
            }
            Node prev = start;
            Node s = start.getNext();
            while(s != end){
                if(s.getValue() == value){
                    prev.setNext(s.getNext());
                    size--;
                }
                s = s.getNext();
            }
            if(end.getValue() == value) {
                end = prev;
                prev.setNext(null);
                size--;
            }
        }
    }

}
