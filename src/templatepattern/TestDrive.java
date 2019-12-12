package templatepattern;

import facadepattern.ACMode;
import facadepattern.LampMode;
import facadepattern.TVMode;
import facadepattern.facade.SleepFacade;

public class TestDrive {
    public static void main(String[] args) {

        FoodBowl foodBowl = new Baso();
        Baso baso = (Baso) foodBowl;
        baso.setKuah(false);
        baso.prepareFoodBowl();

        FoodBowl foodBowl2 = new Soto();
        foodBowl2.prepareFoodBowl();

        FoodBowl foodBowl3 = new MieAyam();
        foodBowl3.prepareFoodBowl();
    }
}
