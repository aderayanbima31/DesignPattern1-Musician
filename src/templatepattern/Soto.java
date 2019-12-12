package templatepattern;

public class Soto extends FoodBowl {
    @Override
    void addingTopping() {
        System.out.println("Adding bihun");
    }

    @Override
    void addingKuah() {
        System.out.println("Adding kuah kaldu soto");
    }
}
