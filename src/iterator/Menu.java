package iterator;

import java.util.Iterator;

public interface Menu<T> {

    Iterator<T> createIterator();
}
