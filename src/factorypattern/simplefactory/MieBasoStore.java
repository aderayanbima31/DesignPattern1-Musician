package factorypattern.simplefactory;

public class MieBasoStore {

    private MieBasoFactory mieBasoFactory;

    public MieBasoStore(MieBasoFactory mieBasoFactory){
        this.mieBasoFactory = mieBasoFactory;
    }

    public MieBaso orderMieBaso(String type) {
        MieBaso mieBaso = mieBasoFactory.createMieBaso(type);

        mieBaso.prepare();
        mieBaso.stirSeasoning();
        mieBaso.addSauce();
        mieBaso.addSpoon();

        return mieBaso;
    }
}
