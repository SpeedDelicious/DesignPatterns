package at.fh.oo.java.OberverundAbstract;

public class Table extends AbstractMeasurementObserver{

    public Table(int serialNumber) {
        super(serialNumber);
    }

    @Override
    public void alarm(int x, int y) {
        System.out.println("Alarm! Table x: " + x + " y: " + y + " Seriennummer: " + super.serialNumber);
    }
}
