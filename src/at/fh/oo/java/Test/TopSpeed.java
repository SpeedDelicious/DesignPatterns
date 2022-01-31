package at.fh.oo.java.Test;

public class TopSpeed implements MotorControl {
    @Override
    public void gasUsage(int s) {
        System.out.println("Due to " + s + " km/h TopSpeed is used");
    }
}
