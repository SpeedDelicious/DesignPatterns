package at.fh.oo.java.Test;

public class Economy implements MotorControl {
    @Override
    public void gasUsage(int s) {
        System.out.println("Due to " + s + " km/h Economy is used");
    }
}
