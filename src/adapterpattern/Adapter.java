package adapterpattern;

public class Adapter implements IBebek{

    Ayam ayam;

    public Adapter(Ayam ayam){
        this.ayam = ayam;
    }

    @Override
    public void quack() {
        ayam.kur();
    }

    @Override
    public void fly() {
        ayam.jump();
        ayam.jump();
    }
}
