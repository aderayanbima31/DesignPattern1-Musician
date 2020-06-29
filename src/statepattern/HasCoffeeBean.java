package statepattern;

public class HasCoffeeBean implements State {

    private CoffeeMaker coffeeMaker;

    public HasCoffeeBean(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public void addCoffeeBean() {
        System.out.println("There are no space for adding some Coffee Bean");
    }

    @Override
    public void generateCoffee() {
        System.out.println("Generate Coffee");
        coffeeMaker.setState(coffeeMaker.getEmptyCoffeeBean());
    }
}
