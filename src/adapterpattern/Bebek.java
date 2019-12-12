package adapterpattern;

public class Bebek implements IBebek{


    @Override
    public void quack() {
        System.out.println("Quack quack!");
    }

    @Override
    public void fly() {
        System.out.println("I can fly!");
    }
}
