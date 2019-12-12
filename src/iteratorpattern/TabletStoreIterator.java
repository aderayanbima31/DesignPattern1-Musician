package iteratorpattern;

import java.util.Iterator;
import java.util.function.Consumer;

public class TabletStoreIterator implements Iterator {

    private GadgetItem[] gadgetItems;

    private int currentPosition = 0;

    public TabletStoreIterator(GadgetItem[] gadgetItems){
        this.gadgetItems = gadgetItems;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < gadgetItems.length && gadgetItems[currentPosition] != null;
    }

    @Override
    public Object next() {
        GadgetItem gadgetItem = gadgetItems[currentPosition];
        currentPosition += 1;
        return gadgetItem;
    }

    @Override
    public void remove() {
        if (currentPosition <= 0){
            throw new IllegalStateException("You can't remove an gadget until you've done at least one next()");
        }

        if (gadgetItems[currentPosition-1] != null){
            for (int i = currentPosition-1; i < gadgetItems.length; i++){
                gadgetItems[i] = gadgetItems[i+1];
            }
            gadgetItems[gadgetItems.length-1] = null;
        }
    }
}
