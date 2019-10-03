package factorypattern.useabstractfactorypattern.miebaso;

import factorypattern.useabstractfactorypattern.IngredientFactory.MieBasoIngredientFactory;

public class MieBasoSetan extends MieBaso {

    MieBasoIngredientFactory mieBasoIngredientFactory;

    public MieBasoSetan(MieBasoIngredientFactory mieBasoIngredientFactory){
        this.mieBasoIngredientFactory = mieBasoIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Persiapan " + namaMieBaso);
        kuah = mieBasoIngredientFactory.createKuah();
        topping = mieBasoIngredientFactory.createTopping();
    }
}
