package at.fh.oo.java.Observer;

public class Main {
    public static void main(String[] args) {

        Salt s1 = new Salt();
        Heating h1 = new Heating();
        Klima k1 = new Klima();


        TemperaturSensor ts = new TemperaturSensor();
        ts.addObserver(s1);
        ts.addObserver(h1);
        ts.addObserver(k1);

        ts.alarm();
    }
}
