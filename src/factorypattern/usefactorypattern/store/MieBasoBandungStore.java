package factorypattern.usefactorypattern.store;

import factorypattern.usefactorypattern.BandungMieBasoBarbel;
import factorypattern.usefactorypattern.BandungMieBasoRudal;
import factorypattern.usefactorypattern.MieBaso;
import factorypattern.usefactorypattern.MieBasoStore;

public class MieBasoBandungStore extends MieBasoStore {

    @Override
    public MieBaso createMieBaso(String type) {
        MieBaso mieBaso;

        if (type.equals(MieBasoStore.BASO_BARBEL)){
            mieBaso = new BandungMieBasoBarbel();
        }else {
            mieBaso = new BandungMieBasoRudal();
        }
        return mieBaso;
    }
}
