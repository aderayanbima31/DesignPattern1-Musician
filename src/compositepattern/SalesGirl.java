package compositepattern;

import java.util.Iterator;

import static compositepattern.GadgetItem.MANUAL_TYPE;

public class SalesGirl {
    private GadgetStoreComponent allGadgetStore;

    public SalesGirl(GadgetStoreComponent allGadgetStore) {
        this.allGadgetStore = allGadgetStore;
    }

    public void printBrosur() {
        allGadgetStore.print();
    }

    public void printBrosurManualType() {
        Iterator iterator = allGadgetStore.createIterator();
        System.out.println("\n--------- Manual Type Gadget Only --------");

        while (iterator.hasNext()) {
            GadgetStoreComponent gadgetStoreComponent = (GadgetStoreComponent) iterator.next();

            try {
                if (MANUAL_TYPE.equals(gadgetStoreComponent.getType())) {
                    gadgetStoreComponent.print();
                }
            } catch (UnsupportedOperationException e) {}
        }
    }
}
