package iterator;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;

public class CoffeeMenu implements Menu<MenuItem>{

    private Hashtable<String, MenuItem> hashtable;

    public CoffeeMenu(){
        hashtable = new Hashtable<>();

        addItem(new MenuItem("Veggie burger and air fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato and fries",
                true,
                3.99));

        addItem(new MenuItem("Soup of the day",
                "A cup of soup of the day, with a side salad",
                false,
                3.69));

        addItem(new MenuItem("Buritto",
                "A large Buritto, with whole pinto beans, salsa, guacamole",
                true,
                4.29));

    }

    private void addItem(MenuItem item){
        hashtable.put(item.getName(), item);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return hashtable.values().iterator();
    }

//    public Hashtable<String, MenuItem> getMenu(){
//        return hashtable;
//    }

}
