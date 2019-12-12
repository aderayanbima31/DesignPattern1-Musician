package iteratorpattern;

import javafx.scene.control.Tab;

import java.util.Iterator;

public class TabletStore implements Gadget {

    private static final int MAX_ITEM = 3;

    private GadgetItem[] gadgetItems;

    private int currentPosition = 0;

    public TabletStore(){
        gadgetItems = new GadgetItem[3];
        addItem("TB J1", "Non-Flagship", "Samsung");
        addItem("Ipad X", "Flagship", "Apple");
        addItem("Xiaomi Pad C10", "Non-Flagship", "Xiaomi");

    }

    private void addItem(String name, String type, String brand){
        if (currentPosition < MAX_ITEM){
            gadgetItems[currentPosition] = new GadgetItem(name, type, brand);
            currentPosition += 1;
        }else {
            System.out.println("List gadget item is full, item can't add to list vehicle.");
        }
    }

    @Override
    public Iterator createIterator() {
        return new TabletStoreIterator(gadgetItems);
    }
}
