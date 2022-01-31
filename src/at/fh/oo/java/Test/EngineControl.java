package at.fh.oo.java.Test;

public class EngineControl {

    int selectAlgo;

    public EngineControl(int selectAlgo) {
        this.selectAlgo = selectAlgo;
    }

    SuperSpar superSpar = new SuperSpar();
    TopSpeed topSpeed = new TopSpeed();
    Economy economy = new Economy();

    public void algoUse(){
        if(this.selectAlgo == 1){
            economy.gasUsage();
        }
        else if(this.selectAlgo == 2)
        {
            topSpeed.gasUsage();
        }
        else if(this.selectAlgo == 3){
            superSpar.gasUsage();
        }
    }


}
