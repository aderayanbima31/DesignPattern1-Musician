package compositepattern;

import java.util.Iterator;
import java.util.Stack;
import java.util.function.Consumer;

public class CompositeIterator implements Iterator {

    private Stack stack = new Stack();

    public CompositeIterator(Iterator iterator){
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator iterator = (Iterator) stack.peek();
            if (!iterator.hasNext()){
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator iterator = (Iterator) stack.peek();
            GadgetStoreComponent gadgetStoreComponent = (GadgetStoreComponent) iterator.next();
            if (gadgetStoreComponent instanceof GadgetStore) {
                stack.push(gadgetStoreComponent.createIterator());
            }
            return gadgetStoreComponent;
        } else {
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
