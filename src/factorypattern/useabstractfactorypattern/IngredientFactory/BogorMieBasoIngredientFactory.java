package factorypattern.useabstractfactorypattern.IngredientFactory;

import factorypattern.useabstractfactorypattern.kuah.Kuah;
import factorypattern.useabstractfactorypattern.kuah.KuahOriental;
import factorypattern.useabstractfactorypattern.topping.KikilSapi;
import factorypattern.useabstractfactorypattern.topping.Topping;

import java.util.ArrayList;
import java.util.List;

public class BogorMieBasoIngredientFactory implements MieBasoIngredientFactory {

    @Override
    public Kuah createKuah() {
        return new KuahOriental();
    }

    @Override
    public List<Topping> createTopping() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(new KikilSapi());
        return toppings;
    }
}
