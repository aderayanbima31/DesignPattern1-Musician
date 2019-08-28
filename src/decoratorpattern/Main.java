package decoratorpattern;

import decoratorpattern.laukpauk.Kangkung;
import decoratorpattern.laukpauk.Kikil;
import decoratorpattern.laukpauk.TahuTempe;
import decoratorpattern.nasi.NasiMerah;
import decoratorpattern.nasi.NasiPutih;

public class Main {

    public static void main(String[] args){

        System.out.println("================WARTEG DANA==================");
        System.out.println();

        //Init Nasi Putih
        MenuWarteg menuWarteg = new NasiPutih();
        System.out.println(menuWarteg.getDescription() + " = Rp" + menuWarteg.cost());


        //Init Nasi Merah
        MenuWarteg menuWarteg2 = new NasiMerah();
        System.out.println(menuWarteg2.getDescription() + " = Rp" + menuWarteg2.cost());


        //Init Nasi Putih + Lauk
        MenuWarteg menuWarteg3 = new NasiPutih();
        menuWarteg3 = new Kangkung(menuWarteg3);
        menuWarteg3 = new Kikil(menuWarteg3);
        System.out.println(menuWarteg3.getDescription() + " = Rp" + menuWarteg3.cost());


        //Init Nasi Merah + Lauk
        MenuWarteg menuWarteg4 = new NasiMerah();
        menuWarteg4 = new Kangkung(menuWarteg4);
        menuWarteg4 = new Kikil(menuWarteg4);
        menuWarteg4 = new TahuTempe(menuWarteg4);
        System.out.println(menuWarteg4.getDescription() + " = Rp" + menuWarteg4.cost());

    }
}
