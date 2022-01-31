package at.fh.oo.java.OberverundAbstract;

import java.util.ArrayList;
import java.util.List;

public class MeasurementSensor {

    private List<MeasurementObserver> observerList;

    public MeasurementSensor() {
        this.observerList = new ArrayList<>();
    }

    public void addObserver(MeasurementObserver observer){
        this.observerList.add(observer);
    }

    public void alarm(int x, int y){
        for (MeasurementObserver observer: this.observerList) {
            observer.alarm(x,y);
        }
    }

}
