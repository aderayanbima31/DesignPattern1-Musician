package statepattern;

public class TestDrive {
    public static void main(String[] args) {

        CoffeeMaker coffeeMaker = new CoffeeMaker();

        coffeeMaker.addCoffeeBeans();
        coffeeMaker.generateCoffee();
        System.out.println();

        coffeeMaker.generateCoffee();
        coffeeMaker.addCoffeeBeans();
        System.out.println();

        coffeeMaker.addCoffeeBeans();
        coffeeMaker.generateCoffee();

    }
}
