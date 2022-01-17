package at.fh.oo.java.Observer;

import java.util.ArrayList;
import java.util.List;

public class TemperaturSensor {
    private List<Observer> observers;

    public TemperaturSensor() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    public void alarm(){
        for (Observer observer:this.observers) {
            observer.alarm(-3);
        }
    }
}
