package observepattern.withjavautil;

import java.util.Observable;
import java.util.Observer;

public class HexaObserver implements Observer {

    Observable observable;
    private int state;

    public HexaObserver(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof Subject) {
            Subject subject = (Subject) observable;
            this.state = subject.getState();
            display();
        }
    }

    public void display() {
        System.out.println("Hexa String: " + Integer.toHexString(state));
    }
}