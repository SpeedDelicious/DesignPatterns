package at.fh.oo.java.Test;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(70);
        SuperSpar superSpar = new SuperSpar();
        TopSpeed topSpeed = new TopSpeed();
        Economy economy = new Economy();

        if(car.speed <= 50){

            superSpar.gasUsage(car.speed);
        }
        else if(car.speed > 50 && car.speed <= 100){
            topSpeed.gasUsage(car.speed);
        }
        else if(car.speed > 100 && car.speed <= 200){
            economy.gasUsage(car.speed);
        }
    }
}
