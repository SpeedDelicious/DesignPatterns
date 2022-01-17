package at.fh.oo.java.Singelton;

public class SingeltonCounter {

    private static SingeltonCounter instance = null;
    private int counter = 0;

    public SingeltonCounter() {
    }

    static SingeltonCounter getInstance(){
        if(instance == null){
            instance = new SingeltonCounter();
            return instance;
        }
        else
        {
            return instance;
        }
    }

    public void increaseCounter(){
        this.counter++;
    }

    public int getCounter(){
        return this.counter;
    }
}
