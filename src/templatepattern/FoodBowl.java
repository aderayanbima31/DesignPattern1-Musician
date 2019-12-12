package templatepattern;

public abstract class FoodBowl {

    final void prepareFoodBowl(){
        setBowl();
        putIngridients();
        addingTopping();
        if (optionalKuah()){
            addingKuah();
        }
    }

    public void setBowl(){
        System.out.println("Setup bowl");
    }

    public void putIngridients(){
        System.out.println("Put ingredients");
    }

    abstract void addingTopping();

    abstract void addingKuah();

    boolean optionalKuah(){
        return true;
    }
}
