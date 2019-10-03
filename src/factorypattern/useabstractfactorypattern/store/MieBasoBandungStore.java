package factorypattern.useabstractfactorypattern.store;

import factorypattern.useabstractfactorypattern.IngredientFactory.BandungMieBasoIngredientFactory;
import factorypattern.useabstractfactorypattern.IngredientFactory.MieBasoIngredientFactory;
import factorypattern.useabstractfactorypattern.miebaso.MieBaso;
import factorypattern.useabstractfactorypattern.miebaso.MieBasoBarbel;
import factorypattern.useabstractfactorypattern.miebaso.MieBasoRudal;

public class MieBasoBandungStore extends MieBasoStore {

    private static final String KHAS = "Mie Baso khas Bandung";

    @Override
    public MieBaso createMieBaso(String type) {
        MieBaso mieBaso;

        MieBasoIngredientFactory mieBasoIngredientFactory = new BandungMieBasoIngredientFactory();

        if (type.equals(MieBasoStore.BASO_BARBEL)){
            mieBaso = new MieBasoBarbel(mieBasoIngredientFactory);
        }else if (type.equals(MieBasoStore.BASO_RUDAL)){
            mieBaso = new MieBasoRudal(mieBasoIngredientFactory);
        } else {
            mieBaso = new MieBasoRudal(mieBasoIngredientFactory);
        }

        mieBaso.setJenisBaso(KHAS + " " + type);
        return mieBaso;
    }
}
