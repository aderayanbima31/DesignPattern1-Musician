package factorypattern.useabstractfactorypattern.IngredientFactory;

import factorypattern.useabstractfactorypattern.kuah.Kuah;
import factorypattern.useabstractfactorypattern.kuah.KuahTomyam;
import factorypattern.useabstractfactorypattern.topping.KerupukKulit;
import factorypattern.useabstractfactorypattern.topping.Topping;

import java.util.ArrayList;
import java.util.List;

public class BandungMieBasoIngredientFactory implements MieBasoIngredientFactory {
    @Override
    public Kuah createKuah() {
        return new KuahTomyam();
    }

    @Override
    public List<Topping> createTopping() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(new KerupukKulit());
        return toppings;
    }
}
