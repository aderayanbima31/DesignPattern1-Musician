package decoratorpattern.laukpauk;

import decoratorpattern.LaukDecorator;
import decoratorpattern.MenuWarteg;

public class Kikil extends LaukDecorator {

    private static final int COST = 7000;

    private static final String DESC = "Kikil";


    MenuWarteg menuWarteg;

    public Kikil(MenuWarteg menuWarteg){
        this.menuWarteg = menuWarteg;
    }

    @Override
    public String getDescription() {
        return menuWarteg.getDescription() + ", " + DESC;
    }

    @Override
    public int cost() {
        return COST + menuWarteg.cost();
    }
}
