package at.fh.oo.java.OberverundAbstract;

public class LineChart extends AbstractMeasurementObserver{

    public LineChart(int serialNumber) {
        super(serialNumber);
    }

    @Override
    public void alarm(int x, int y) {
        System.out.println("Alarm! LineChart x: " + x + " y: " + y + " Seriennummer: " + super.serialNumber);
    }

}
