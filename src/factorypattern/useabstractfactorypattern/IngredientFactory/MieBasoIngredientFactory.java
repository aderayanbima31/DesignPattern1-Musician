package factorypattern.useabstractfactorypattern.IngredientFactory;

import factorypattern.useabstractfactorypattern.kuah.Kuah;
import factorypattern.useabstractfactorypattern.topping.Topping;

import java.util.List;

public interface MieBasoIngredientFactory {

    public Kuah createKuah();

    public List<Topping> createTopping();

}
