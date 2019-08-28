package decoratorpattern.laukpauk;

import decoratorpattern.MenuWarteg;

public class TahuTempe extends MenuWarteg{

    private static final int COST = 6000;

    private static final String DESC = "Tahu Tempe";


    MenuWarteg menuWarteg;

    public TahuTempe(MenuWarteg menuWarteg){
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
