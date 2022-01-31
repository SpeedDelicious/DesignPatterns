package at.fh.oo.java.OberverundAbstract;

public class BarChart extends AbstractMeasurementObserver{
    @Override
    public void alarm(int x, int y) {
        System.out.println("Alarm! BarChart  x: " + x + " y: " + y + " Seriennummer: " + super.serialNumber);
    }

    public BarChart(int serialNumber) {
        super(serialNumber);
    }
}
