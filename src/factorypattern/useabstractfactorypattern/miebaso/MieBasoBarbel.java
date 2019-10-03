package factorypattern.useabstractfactorypattern.miebaso;

import factorypattern.useabstractfactorypattern.IngredientFactory.MieBasoIngredientFactory;

public class MieBasoBarbel extends MieBaso {

    MieBasoIngredientFactory mieBasoIngredientFactory;

    public MieBasoBarbel(MieBasoIngredientFactory mieBasoIngredientFactory){
        this.mieBasoIngredientFactory = mieBasoIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Persiapan " + namaMieBaso);
        kuah = mieBasoIngredientFactory.createKuah();
        topping = mieBasoIngredientFactory.createTopping();
    }
}
