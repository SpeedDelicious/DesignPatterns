package at.fh.oo.java.Encrypter;

import org.lwjgl.Sys;

public class Cäsar implements Encrypter{
    @Override
    public String encrypt(String string) {
        return string + " by Cäsar";
    }
}
