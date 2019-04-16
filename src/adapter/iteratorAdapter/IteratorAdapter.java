package adapter.iteratorAdapter;

import java.util.Enumeration;
import java.util.Iterator;
/**将iterator 转为 enumeration */
public class IteratorAdapter<T> implements Enumeration {

    private Iterator<T> iterator;

    public IteratorAdapter(Iterator iterator){
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public T nextElement() {
        return iterator.next();
    }


}
