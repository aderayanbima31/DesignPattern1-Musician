package iteratorpattern;

import java.util.Iterator;

public class Salesgirl {

    private Gadget handphoneStore;

    private Gadget tabletStore;

    private Gadget laptopStore;

    public Salesgirl(Gadget handphoneStore, Gadget tabletStore, Gadget laptopStore){
        this.handphoneStore = handphoneStore;
        this.tabletStore = tabletStore;
        this.laptopStore = laptopStore;
    }

    public void printBrosur(){
        Iterator handphoneStoreIterator = handphoneStore.createIterator();
        Iterator tabletStoreIterator = tabletStore.createIterator();
        Iterator laptopStoreIterator = laptopStore.createIterator();
        System.out.println("\nHandphone Store : ");
        printBrosur(handphoneStoreIterator);

        System.out.println("\nTablet Store : ");
        printBrosur(tabletStoreIterator);

        System.out.println("\nLaptop Store : ");
        printBrosur(laptopStoreIterator);
    }

    public void printBrosur(Iterator iterator){
        while (iterator.hasNext()){
            GadgetItem gadgetItem = (GadgetItem) iterator.next();
            System.out.println(gadgetItem.getName() + " - " + gadgetItem.getType() + " - " + gadgetItem.getBrand());
        }
    }
}
