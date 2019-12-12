package templatepattern;

public class Baso extends FoodBowl {

    boolean kuah = false;

    @Override
    void addingTopping() {
        System.out.println("Adding Toge");
    }

    @Override
    void addingKuah() {
        System.out.println("Adding kuah kaldu sapi");
    }

    public void setKuah(boolean kuah) {
        this.kuah = kuah;
    }

    @Override
    boolean optionalKuah() {
        return kuah;
    }
}
