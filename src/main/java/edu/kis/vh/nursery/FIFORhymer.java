package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer buffer = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!isEmpty())
            buffer.countIn(super.countOut());

        int ret = buffer.countOut();

        while (!buffer.isEmpty())
            countIn(buffer.countOut());

        return ret;
    }
}
