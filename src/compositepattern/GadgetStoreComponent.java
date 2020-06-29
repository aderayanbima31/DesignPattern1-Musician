package compositepattern;

import java.util.Iterator;

public abstract class GadgetStoreComponent {

    public void add(GadgetStoreComponent gadgetStoreComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(GadgetStoreComponent gadgetStoreComponent) {
        throw new UnsupportedOperationException();
    }

    public GadgetStoreComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getStoreName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getType() {
        throw new UnsupportedOperationException();
    }

    public String getBrand() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

    public Iterator createIterator() {
        throw new UnsupportedOperationException();
    }

}
