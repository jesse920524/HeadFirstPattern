package iterator.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {
    private static final String TAG = "Menu";

    private List<MenuComponent> menuComponentList;
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
        menuComponentList = new ArrayList<>();
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChildAt(int i) {
        return menuComponentList.get(i);
    }

    @Override
    public void print() {
        System.out.println("\n" + getName());
        System.out.println("\n" + getDescription());
        System.out.println("--------------------");

        Iterator<MenuComponent> iterator = menuComponentList.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }


}
