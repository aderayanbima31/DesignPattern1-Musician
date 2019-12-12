package iteratorpattern;

public class TestDrive {
    public static void main(String[] args) {
        HandphoneStore handphoneStore = new HandphoneStore();
        TabletStore tabletStore = new TabletStore();
        LaptopStore laptopStore = new LaptopStore();

        Salesgirl salesgirl = new Salesgirl(handphoneStore, tabletStore, laptopStore);
        salesgirl.printBrosur();
    }
}
