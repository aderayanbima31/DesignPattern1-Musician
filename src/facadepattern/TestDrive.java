package facadepattern;

import facadepattern.facade.SleepFacade;

public class TestDrive {
    public static void main(String[] args) {

        SleepFacade sleepFacade = new SleepFacade(new ACMode(), new LampMode(), new TVMode());

        sleepFacade.sleepMode();
        sleepFacade.wakeMode();
    }
}
