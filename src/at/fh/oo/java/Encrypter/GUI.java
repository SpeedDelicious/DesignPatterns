package at.fh.oo.java.Encrypter;

public class GUI {

    public static void  main(String[] args) {
        String string = "Beispieltext";

        Encrypter ec = new Cäsar();
        String caeser = ec.encrypt(string);

        Encrypter er = new Reverse();
        String reverse = er.encrypt(string);

        System.out.print(caeser + "\n");
        System.out.print(reverse + "\n");
    }
}
