package adapter.enumerationAdapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by Jesse Fu on 2019-04-06.
 *
 * 内部使用Enumeration类实现的Iterator。（适配器模式）
 */
public class Enumerationiterator implements Iterator{

    private Enumeration enumeration;

    public Enumerationiterator(Enumeration enumeration){
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
