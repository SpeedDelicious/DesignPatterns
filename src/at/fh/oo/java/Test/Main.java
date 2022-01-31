package at.fh.oo.java.Test;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(30);
        int carSpeed = car.speed;

        SelectAlgo selectAlgo = new SelectAlgo();

       ;EngineControl engineControl = new EngineControl(selectAlgo.rangeReached(carSpeed));
       engineControl.algoUse();
    }
}
