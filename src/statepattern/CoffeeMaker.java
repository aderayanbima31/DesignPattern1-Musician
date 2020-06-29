package statepattern;

public class CoffeeMaker {
    EmptyCoffeeBean emptyCoffeeBean;

    HasCoffeeBean hasCoffeeBean;

    State state;

    public CoffeeMaker() {
        emptyCoffeeBean = new EmptyCoffeeBean(this);
        hasCoffeeBean = new HasCoffeeBean(this);

        state = emptyCoffeeBean;
    }

    public void addCoffeeBeans() {
        state.addCoffeeBean();
    }

    public void generateCoffee() {
        state.generateCoffee();
    }

    public void setState(State state){
        this.state = state;
    }

    public State getEmptyCoffeeBean() {
        return emptyCoffeeBean;
    }

    public State getHasCoffeeBean() {
        return hasCoffeeBean;
    }
}
