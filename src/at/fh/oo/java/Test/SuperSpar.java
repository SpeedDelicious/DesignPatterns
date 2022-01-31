package at.fh.oo.java.Test;

public class SuperSpar implements MotorControl {
    @Override
    public void gasUsage(int s) {
        System.out.println("Due to " + s + " km/h SuperSpar is used");
    }
}
