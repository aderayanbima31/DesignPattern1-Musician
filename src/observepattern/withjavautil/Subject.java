package observepattern.withjavautil;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Subject extends Observable {

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState(){
        return state;
    }

    public void setState(int state){
        this.state = state;
        setChanged();
        notifyObservers();

    }

    //Java util menggunakan attach bawaan to add observer
    /*public void attach(Observer observer){
        observers.add(observer);
    }*/

}
