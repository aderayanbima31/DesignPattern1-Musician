package iteratorpattern;

import java.util.HashMap;
import java.util.Iterator;

public class LaptopStore implements Gadget{

    private HashMap gadgetItems = new HashMap();

    public LaptopStore(){
        addItem("A320 Series", "SSD", "Asus");
        addItem("Vaio", "HDD", "Sony");
        addItem("Mackbook Pro", "SSD", "Apple");
        addItem("Macbook Air", "SSD", "Apple");
    }

    private void addItem(String name, String type, String brand){
        gadgetItems.put(name, new GadgetItem(name, type, brand));
    }

    @Override
    public Iterator createIterator() {
        return gadgetItems.values().iterator();
    }
}
