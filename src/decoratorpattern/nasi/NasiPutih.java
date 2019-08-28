package decoratorpattern.nasi;

import decoratorpattern.MenuWarteg;

public class NasiPutih extends MenuWarteg {

    private static final int COST = 7000;

    private static final String DESC = "Nasi Putih";

    @Override
    public int cost() {
        return COST;
    }

    public NasiPutih() {
        description = DESC;
    }
}
