package adapterpattern;

public class TestDrive {
    public static void main(String[] args){

        Ayam ayam = new Ayam();
        Bebek bebek = new Bebek();

        IBebek bebek1 = bebek;

        IBebek bebek2 = new Adapter(ayam);

        bebek1.fly();
        bebek2.fly();
    }
}
