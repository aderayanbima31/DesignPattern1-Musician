package facadepattern.facade;

import facadepattern.ACMode;
import facadepattern.LampMode;
import facadepattern.TVMode;

public class SleepFacade {

    ACMode acMode;
    LampMode lampMode;
    TVMode tvMode;

    public SleepFacade(ACMode acMode, LampMode lampMode, TVMode tvMode){
        this.acMode = acMode;
        this.lampMode = lampMode;
        this.tvMode =tvMode;
    }

    public void sleepMode(){
        acMode.cooler();
        lampMode.dim();
        tvMode.off();
    }

    public void wakeMode(){
        acMode.warm();
        lampMode.bright();
        tvMode.on();
    }
}
