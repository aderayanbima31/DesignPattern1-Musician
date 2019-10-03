package factorypattern.useabstractfactorypattern;

import factorypattern.useabstractfactorypattern.miebaso.MieBaso;
import factorypattern.useabstractfactorypattern.store.MieBasoBandungStore;
import factorypattern.useabstractfactorypattern.store.MieBasoStore;

public class Main {

    public static void main(String[] args){

        MieBasoStore mieBasoBandungStore = new MieBasoBandungStore();

        MieBaso mieBasoBandung = mieBasoBandungStore.orderMieBaso(MieBasoStore.BASO_BARBEL);
        System.out.println("Order :" + mieBasoBandung.getJenisBaso());
        System.out.println("-------------------------------------------");

        mieBasoBandungStore.orderMieBaso(MieBasoStore.BASO_RUDAL);
        System.out.println("Order :" + mieBasoBandung.getJenisBaso());
        System.out.println("-------------------------------------------");

        mieBasoBandungStore.orderMieBaso(MieBasoStore.BASO_SETAN);
        System.out.println("Order :" + mieBasoBandung.getJenisBaso());
        System.out.println("-------------------------------------------");

    }
}
