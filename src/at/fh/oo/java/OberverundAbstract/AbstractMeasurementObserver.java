package at.fh.oo.java.OberverundAbstract;

public abstract class AbstractMeasurementObserver implements MeasurementObserver{
    protected int serialNumber;

    public AbstractMeasurementObserver(int serialNumber) {
    }

    public int getSerialNumber(){
        return this.serialNumber;
    }
}
