package at.fh.oo.java.Encrypter;

public class Reverse implements Encrypter{
    @Override
    public String encrypt(String string) {
        return string + " by Reverse";
    }
}
