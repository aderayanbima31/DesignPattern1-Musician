package factorypattern.useabstractfactorypattern.store;


import factorypattern.useabstractfactorypattern.IngredientFactory.BogorMieBasoIngredientFactory;
import factorypattern.useabstractfactorypattern.IngredientFactory.MieBasoIngredientFactory;
import factorypattern.useabstractfactorypattern.miebaso.MieBaso;
import factorypattern.useabstractfactorypattern.miebaso.MieBasoBarbel;
import factorypattern.useabstractfactorypattern.miebaso.MieBasoRudal;

public class MieBasoBogorStore extends MieBasoStore {

    private static final String KHAS = "Mie Baso khas Bogor";

    @Override
    public MieBaso createMieBaso(String type) {
        MieBaso mieBaso;

        MieBasoIngredientFactory mieBasoIngredientFactory = new BogorMieBasoIngredientFactory();

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
