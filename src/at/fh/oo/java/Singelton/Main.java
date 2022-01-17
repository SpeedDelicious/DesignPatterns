package at.fh.oo.java.Singelton;

public class Main {

    public static void main(String[] args) {

        SingeltonCounter sc = new SingeltonCounter();

        SingeltonCounter sc1 = SingeltonCounter.getInstance();
        SingeltonCounter sc2 = SingeltonCounter.getInstance();

        sc1.increaseCounter();
        sc2.increaseCounter();

        System.out.println(sc1.getCounter());
        System.out.println(sc2.getCounter());
    }
}
