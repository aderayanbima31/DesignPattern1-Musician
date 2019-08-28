package decoratorpattern.laukpauk;

import decoratorpattern.LaukDecorator;
import decoratorpattern.MenuWarteg;

public class Kangkung extends LaukDecorator {

    private static final int COST = 3000;

    private static final String DESC = "Kangkung";

    MenuWarteg menuWarteg;

    public Kangkung(MenuWarteg menuWarteg){
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
