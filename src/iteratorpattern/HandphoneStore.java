package iteratorpattern;

import java.util.ArrayList;
import java.util.Iterator;

public class HandphoneStore implements Gadget {

    private ArrayList<GadgetItem> gadgetItems;

    public HandphoneStore(){
        gadgetItems = new ArrayList<>();
        addItem("S10", "Flagship", "Samsung");
        addItem("J1", "Non-Flagship", "Samsung");
        addItem("Iphone X", "Flagship", "Apple");
        addItem("Redmi 4X", "Non-Flagship", "Xiaomi");
    }

    private void addItem(String name, String type, String brand){
        gadgetItems.add(new GadgetItem(name, type, brand));
    }

    @Override
    public Iterator createIterator() {
        return gadgetItems.iterator();
    }
}
