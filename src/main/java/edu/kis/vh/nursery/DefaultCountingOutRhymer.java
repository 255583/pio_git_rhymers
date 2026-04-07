package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int empt = -1;
    public static final int max = 11;
    private final int[] numbers = new int[max+1];

    private int total = empt;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean isEmpty() {
        return total == empt;
    }

    public boolean isFull() {
        return total == max;
    }

    protected int peek() {
        if (isEmpty())
            return empt;
        return numbers[total];
    }

    public int countOut() {
        if (isEmpty())
            return empt;
        return numbers[total--];
    }

}
