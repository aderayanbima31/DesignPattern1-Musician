package decoratorpattern.nasi;

import decoratorpattern.MenuWarteg;

public class NasiMerah extends MenuWarteg {

    private static final int COST = 7000;

    private static final String DESC = "Nasi Merah";

    @Override
    public int cost() {
        return COST;
    }

    public NasiMerah(){
        description = DESC;
    }
}
