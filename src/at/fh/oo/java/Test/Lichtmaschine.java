package at.fh.oo.java.Test;

public class Lichtmaschine implements MotorControl, Observer{
    @Override
    public void gasUsage() {

    }

    @Override
    public int rangeReached(int s) {
        return 0;
    }
}
