package compositepattern;

import java.util.Iterator;

public class GadgetItem extends GadgetStoreComponent {

    public static final String MANUAL_TYPE = "Manual";

    String name;

    String type;

    String brand;

    public GadgetItem(String name, String type, String brand) {
        this.name = name;
        this.type = type;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void print() {
        System.out.print(" " + getName() + " - " + getType() + " - " + getBrand());
        System.out.println();
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }

}
