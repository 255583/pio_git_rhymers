package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public DefaultCountingOutRhymer buffer = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            buffer.countIn(super.countOut());

        int ret = buffer.countOut();

        while (!buffer.callCheck())
            countIn(buffer.countOut());

        return ret;
    }
}
