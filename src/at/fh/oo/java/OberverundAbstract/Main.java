package at.fh.oo.java.OberverundAbstract;

public class Main {
    public static void main(String[] args) {
        BarChart bc1 = new BarChart(1);
        LineChart lc1 = new LineChart(2);
        Table t1 = new Table(3);

        MeasurementSensor measurementSensor = new MeasurementSensor();

        measurementSensor.addObserver(bc1);
        measurementSensor.addObserver(lc1);
        measurementSensor.addObserver(t1);

        measurementSensor.alarm(1,2);
    }
}
