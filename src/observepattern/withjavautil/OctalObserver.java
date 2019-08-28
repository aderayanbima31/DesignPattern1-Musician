package observepattern.withjavautil;

import java.util.Observable;
import java.util.Observer;

public class OctalObserver implements Observer {

    Observable observable;
    private int state;

    public OctalObserver(Observable observable) {
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
        System.out.println("Octal String: " + Integer.toOctalString(state));
    }
}
