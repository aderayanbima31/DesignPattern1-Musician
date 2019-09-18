package factorypattern;

public class MieBasoFactory {

    public static final String BASO_KEJU = "baso keju";

    public static final String BASO_SAPI = "baso sapi";

    public static final String BASO_IKAN = "baso ikan";

    public MieBaso createMieBaso(String type){
        MieBaso mieBaso;

        if (type.equals(BASO_KEJU)){
            mieBaso = new MieBasoKeju();
        }
        else if (type.equals(BASO_SAPI)){
            mieBaso = new MieBasoSapi();
        }
        else {
            mieBaso = new MieBasoIkan();
        }
        return mieBaso;
    }
}
