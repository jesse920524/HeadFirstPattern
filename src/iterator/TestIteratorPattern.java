package iterator;

import java.util.ArrayList;
import java.util.List;

public class TestIteratorPattern {
    public static void main(String[] args) {

        List<Menu> menus = new ArrayList<>();
        menus.add(new PancakeHouseMenu());
        menus.add(new DinerMenu());
        menus.add(new CoffeeMenu());

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();

//        waitress.printVegetarianMenu();

    }
}
