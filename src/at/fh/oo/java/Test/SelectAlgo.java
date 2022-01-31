package at.fh.oo.java.Test;

public class SelectAlgo implements Observer{


    public SelectAlgo() {

    }

    @Override
    public int rangeReached(int s) {
        if(s >= 0 && s <= 50){
            return 1;
        }
        else if(s > 50 && s <= 100){
            return 2;
        }
        else if(s > 100 && s <= 200){
            return 3;
        }
        return 0;
    }
}
