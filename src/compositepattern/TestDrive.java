package compositepattern;

public class TestDrive {

    public static void main(String[] args) {
        GadgetStoreComponent hpStore = new GadgetStore("HP store", "Sell hp");
        GadgetStoreComponent tabletStore = new GadgetStore("Tablet store", "Sell tablet");
        GadgetStoreComponent laptopStore = new GadgetStore("Laptop store", "Sell laptop");

        GadgetStoreComponent appleStore = new GadgetStore("Apple Store", "Apple");
        GadgetStoreComponent googleStore = new GadgetStore("Google Store", "Google");

        GadgetStoreComponent allGadgetStore = new GadgetStore("All Store", "All gadget store");
        allGadgetStore.add(hpStore);
        allGadgetStore.add(tabletStore);
        allGadgetStore.add(laptopStore);

        hpStore.add(new GadgetItem("TB J1", "Non-Flagship", "Samsung"));
        hpStore.add(new GadgetItem("JT50", GadgetItem.MANUAL_TYPE, "Samsung"));
        appleStore.add(new GadgetItem("iPhone X", "fLAGSHIP", "Apple"));
        googleStore.add(new GadgetItem("Pixel", "Flagship", "Google"));


        hpStore.add(appleStore);
        hpStore.add(googleStore);

        tabletStore.add(new GadgetItem("TB 18", "Flagship", "Samsung"));
        tabletStore.add(new GadgetItem("XX10", GadgetItem.MANUAL_TYPE, "Advan"));
        tabletStore.add(new GadgetItem("iPad", "Flagship", "Apple"));

        laptopStore.add(new GadgetItem("SS10", GadgetItem.MANUAL_TYPE, "Samsung"));
        laptopStore.add(new GadgetItem("ASUS320", GadgetItem.MANUAL_TYPE, "ASUS"));
        laptopStore.add(new GadgetItem("VAIO", GadgetItem.MANUAL_TYPE, "SONY"));
        laptopStore.add(tabletStore);

        SalesGirl salesGirl = new SalesGirl(allGadgetStore);
        salesGirl.printBrosur();
        salesGirl.printBrosurManualType();
    }
}
