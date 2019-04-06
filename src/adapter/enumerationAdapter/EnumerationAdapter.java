package adapter.enumerationAdapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by Jesse Fu on 2019-04-06.
 */
public class EnumerationAdapter implements Iterator{

    private Enumeration enumeration;

    public EnumerationAdapter(Enumeration enumeration){
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }
}
