package edu.kis.vh.nursery.list;

import static edu.kis.vh.nursery.DefaultCountingOutRhymer.empt;

public class IntLinkedList {

    private Node last;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return empt;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return empt;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
