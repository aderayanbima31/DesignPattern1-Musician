package compositepattern;

import java.util.ArrayList;
import java.util.Iterator;

public class GadgetStore extends GadgetStoreComponent {

    private ArrayList gadgetStoreComponents = new ArrayList();

    private String storeName;

    private String description;

    public GadgetStore(String storeName, String description){
        this.storeName = storeName;
        this.description = description;
    }

    @Override
    public void add(GadgetStoreComponent gadgetStoreComponent) {
        gadgetStoreComponents.add(gadgetStoreComponent);
    }

    @Override
    public void remove(GadgetStoreComponent gadgetStoreComponent) {
        gadgetStoreComponents.remove(gadgetStoreComponent);
    }

    @Override
    public GadgetStoreComponent getChild(int i) {
        return (GadgetStoreComponent) gadgetStoreComponents.get(i);
    }

    @Override
    public String getStoreName() {
        return storeName;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println();
        System.out.println(getStoreName()+" - "+getDescription());
        System.out.println("--------------------");

        Iterator iterator = gadgetStoreComponents.iterator();
        while (iterator.hasNext()) {
            GadgetStoreComponent gadgetStoreComponent = (GadgetStoreComponent) iterator.next();
            gadgetStoreComponent.print();
        }
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(gadgetStoreComponents.iterator());
    }
}
