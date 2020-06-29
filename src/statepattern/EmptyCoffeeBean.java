package statepattern;

public class EmptyCoffeeBean implements State {
    private CoffeeMaker coffeeMaker;

    public EmptyCoffeeBean(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public void addCoffeeBean() {
        System.out.println("Add some coffee bean inside Coffee Maker");
        coffeeMaker.setState(coffeeMaker.getHasCoffeeBean());
    }

    @Override
    public void generateCoffee() {
        System.out.println("Cannot generate Coffee - Add some Coffee Bean first");
    }
}
