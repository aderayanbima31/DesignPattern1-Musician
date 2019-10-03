package factorypattern.simplefactory;

public class Main {

    public static void main(String[] args){
        MieBasoFactory mieBasoFactory = new MieBasoFactory();

        MieBasoStore mieBasoStore = new MieBasoStore(mieBasoFactory);

        mieBasoStore.orderMieBaso(MieBasoFactory.BASO_IKAN);
        mieBasoStore.orderMieBaso(MieBasoFactory.BASO_SAPI);
        mieBasoStore.orderMieBaso(MieBasoFactory.BASO_KEJU);
    }
}
