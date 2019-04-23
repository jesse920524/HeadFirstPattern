package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu<MenuItem>{

    private List<MenuItem> list;

    public PancakeHouseMenu(){
        list = new ArrayList<>();

        addItem("K&B's Pancake Breakfast",
                "Pancake with scrambled eggs, and toast",
                true,
                2.99
        );

        addItem("Regular Pancake Breakfast",
                "Pancake with fried eggs, sausage",
                false,
                2.99);

        addItem("Blueberry Pancakes",
                "Pancake made with fresh blueberries",
                true, 3.49);

        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);

    }

    private void addItem(String name,
                         String desc,
                         boolean vegetarian,
                         double price){
        MenuItem menuItem = new MenuItem(name, desc, vegetarian, price);
        list.add(menuItem);
    }

//    public List<MenuItem> getMenuItems(){
//        return list;
//    }

    public Iterator<MenuItem> createIterator(){
        return new PancakeHouseIterator(list);
    }

    private static class PancakeHouseIterator implements Iterator<MenuItem>{
        private List<MenuItem> menuItems;
        private int position = 0;
        public PancakeHouseIterator(List<MenuItem> list){
            this.menuItems = list;
            this.position = 0;
        }

        @Override
        public boolean hasNext() {
            if (position >= menuItems.size())
            return false;
            else return true;
        }

        @Override
        public MenuItem next() {
            MenuItem menuItem = menuItems.get(position);
            position +=1;
            return menuItem;
        }
    }
}
