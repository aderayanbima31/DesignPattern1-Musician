package factorypattern.usefactorypattern.store;

import factorypattern.usefactorypattern.BogorMieBasoBarbel;
import factorypattern.usefactorypattern.BogorMieBasoRudal;
import factorypattern.usefactorypattern.MieBaso;
import factorypattern.usefactorypattern.MieBasoStore;

public class MieBasoBogorStore extends MieBasoStore {
    @Override
    public MieBaso createMieBaso(String type) {
        MieBaso mieBaso;

        if (type.equals(MieBasoStore.BASO_BARBEL)){
            mieBaso = new BogorMieBasoBarbel();
        }else {
            mieBaso = new BogorMieBasoRudal();
        }
        return mieBaso;
    }
}
