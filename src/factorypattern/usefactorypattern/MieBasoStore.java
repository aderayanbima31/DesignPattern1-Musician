package factorypattern.usefactorypattern;

public abstract class MieBasoStore {

    public static final String BASO_RUDAL = "Baso Rudal";

    public static final String BASO_BARBEL = "Baso Barbel";

    public MieBaso orderMieBaso(String type) {
        MieBaso mieBaso = createMieBaso(type);

        mieBaso.prepare();
        mieBaso.stirSeasoning();
        mieBaso.addSauce();
        mieBaso.addSpoon();

        return mieBaso;
    }

    public abstract MieBaso createMieBaso(String type);
}
