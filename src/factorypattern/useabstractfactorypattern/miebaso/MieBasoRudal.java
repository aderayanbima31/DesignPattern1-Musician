package factorypattern.useabstractfactorypattern.miebaso;

import factorypattern.useabstractfactorypattern.IngredientFactory.MieBasoIngredientFactory;

public class MieBasoRudal extends MieBaso {

    MieBasoIngredientFactory mieBasoIngredientFactory;

    public MieBasoRudal(MieBasoIngredientFactory mieBasoIngredientFactory){
        this.mieBasoIngredientFactory = mieBasoIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Persiapan " + namaMieBaso);
        kuah = mieBasoIngredientFactory.createKuah();
        topping = mieBasoIngredientFactory.createTopping();
    }
}
