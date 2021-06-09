package mooc.vandy.java4android.gate.logic;

import androidx.annotation.NonNull;

/**
 * This file defines the Gate class.
 */
public class Gate {
    // TODO -- Fill in your code here
    public static final int IN = 1;
    public static final int OUT = -1;
    public static final int CLOSED = 0;
    private static int mSwing;

    public Gate() {
        mSwing = CLOSED;
    }


    public static boolean setSwing(int mSwing) {
        if (mSwing == IN || mSwing == OUT || mSwing == CLOSED) {
            return true;
        } else
            return false;

    }

    public boolean open(int mSwing) {
        if (mSwing != CLOSED) {
            setSwing(mSwing);
            return true;
        } else
            return false;
    }

    public void close() {
        setSwing(CLOSED);
    }

    public static int getSwing() {
        return mSwing;
    }

    public int thru(int count) {
        int hayvanSayisi = 0;
        if (getSwing() == IN)
            return hayvanSayisi + count;
        else if (getSwing() == OUT)
            return hayvanSayisi - count;
        else
            return hayvanSayisi;
    }


    @Override
    public String toString() {
        if (getSwing() == CLOSED) {
            return "This gate is closed";
        } else if (getSwing() == IN) {
            return "This gate is open and swings to enter the pen only";
        } else if (getSwing() == OUT) {
            return "This gate is open and swings to exit the pen only";
        } else {
            return "This gate has an invalid swing direction";
        }
    }
}
