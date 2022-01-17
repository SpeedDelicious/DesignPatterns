package at.fh.oo.java.Observer;

public class Salt implements Observer{
    @Override
    public void alarm(int temperature) {
        System.out.println("salt:" + temperature);
    }

    public void doSalting(){
        System.out.println("I am salty");
    }

    public double saltAmount(){
        var saltAmount = 12.0f;
        return saltAmount;
    }
}
