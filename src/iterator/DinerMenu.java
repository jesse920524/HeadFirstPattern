package iterator;

import java.util.Iterator;

public class DinerMenu implements Menu<MenuItem>{

    private static final int MAX_ITEMS = 6;

    private int numberOfItems = 0;

    private MenuItem[] items;

    public DinerMenu(){
        items = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT",
                "becon with lettuce & tomato on whole wheat",
                true,
                2.99);
        addItem("BLT",
                "becon with lettuce & tomato on whole wheat",
                false,
                2.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad",
                false, 3.29);
        addItem("Hotdog",
                "Hotdog",
                false,
                3.05);


    }

    private void addItem(String name,
                         String desc,
                         boolean vegetarian,
                         double price){
        MenuItem item = new MenuItem(name, desc, vegetarian, price);

        if (numberOfItems >= MAX_ITEMS){
            throw new UnsupportedOperationException("sorry, menu is full!");
        }else{
            items[numberOfItems] = item;
            numberOfItems += 1;
        }
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinerIterator(items);
    }

//    public MenuItem[] getItems() {
//        return items;
//    }


    private class DinerIterator implements Iterator<MenuItem>{

        private MenuItem[] menuItems;

        private int position = 0;

        public DinerIterator(MenuItem[] items){
            this.menuItems = items;
            this.position = 0;
        }

        @Override
        public boolean hasNext() {
            if (position >= menuItems.length || menuItems[position] == null) return false;
            else return true;
        }

        @Override
        public MenuItem next() {
            MenuItem menuItem = menuItems[position];
            position +=1;
            return menuItem;
        }
    }
}
