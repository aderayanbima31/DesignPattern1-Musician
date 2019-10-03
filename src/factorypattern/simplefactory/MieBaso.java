package factorypattern.simplefactory;

import java.util.ArrayList;

public class MieBaso {

    public String name;

    public String bumbu;

    public String sayuran;

    public String mie;

    public String kuah;

    public ArrayList topping = new ArrayList();

    public void prepare(){
        String prepareText = "";
        prepareText += "Persiapan " + name;
        prepareText += "\nTambahkan bumbu :"+bumbu;
        prepareText += "\nTambahkan sayuran :"+sayuran;
        prepareText += "\nTambahkan mie :"+mie;
        prepareText += "\nToping baso :";
        for (int i=0; i<topping.size(); i++){
            prepareText += "\n -" +topping.get(i);
        }
        System.out.println("\n\nPrepare: "+ prepareText);
    }

    public void stirSeasoning(){
        System.out.println("Aduk semua bumbu");
    }

    public void addSauce(){
        System.out.println("Tuangkan kuah panas");
    }

    public void addSpoon(){
        System.out.println("Sediakan sendok, Siap dihidangkan");
    }

    public String getName(){
        return name;
    }
}
