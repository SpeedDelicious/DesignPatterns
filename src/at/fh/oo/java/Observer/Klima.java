package at.fh.oo.java.Observer;

public class Klima implements Observer{
    @Override
    public void alarm(int temperature) {
        System.out.println("Klima:" + temperature);
    }
}
