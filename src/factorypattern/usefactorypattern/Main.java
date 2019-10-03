package factorypattern.usefactorypattern;

import factorypattern.usefactorypattern.store.MieBasoBandungStore;
import factorypattern.usefactorypattern.store.MieBasoBogorStore;

public class Main {

    public static void main(String[] args){
        MieBasoStore mieBasoBandungStore = new MieBasoBandungStore();
        MieBasoStore mieBasoBogorStore = new MieBasoBogorStore();

        MieBaso mieBasoBandung = mieBasoBandungStore.orderMieBaso(MieBasoStore.BASO_BARBEL);
        System.out.println("Pesanan : " + mieBasoBandung.getName());

        mieBasoBandungStore.orderMieBaso(MieBasoStore.BASO_RUDAL);
        System.out.println("Pesanan : " + mieBasoBandung.getName());

        MieBaso mieBasoBogor = mieBasoBogorStore.orderMieBaso(MieBasoStore.BASO_BARBEL);
        System.out.println("Pesanan : " + mieBasoBogor.getName());

    }
}
