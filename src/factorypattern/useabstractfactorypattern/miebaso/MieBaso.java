package factorypattern.useabstractfactorypattern.miebaso;

import factorypattern.useabstractfactorypattern.kuah.Kuah;
import factorypattern.useabstractfactorypattern.topping.Topping;

import java.util.ArrayList;
import java.util.List;

public abstract class MieBaso {

    public String namaMieBaso;

    public Kuah kuah;

    public List<Topping> topping = new ArrayList();

    public abstract void prepare();

    public void stirSeasoning(){
        System.out.println("Aduk semua bumbu");
    }

    public void addSauce(){
        System.out.println("Tuangkan kuah panas");
    }

    public void addSpoon(){
        System.out.println("Sediakan sendok, Siap dihidangkan");
    }

    public void setJenisBaso(String namaMieBaso){
        this.namaMieBaso = namaMieBaso;
    }

    public String getJenisBaso(){
        return namaMieBaso;
    }

    public String toString(){
        StringBuffer result = new StringBuffer();
        if (kuah != null){
            result.append(kuah + "\n");
        }
        if (topping != null){
            int i = 0;
            for (Topping toppingItems: topping) {
                result.append(toppingItems);

                if (i < topping.size() - 1){
                    result.append(", ");
                }
                i++;
            }
            result.append("\n");
        }
        return result.toString();
    }

    public void compose(){
        System.out.println(toString());
    }
}
