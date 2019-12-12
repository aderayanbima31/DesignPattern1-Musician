package templatepattern;

public class MieAyam extends FoodBowl {
    @Override
    void addingTopping() {
        System.out.println("Adding mie");
    }

    @Override
    void addingKuah() {
        System.out.println("Adding kuah kaldu ayam");
    }
}
