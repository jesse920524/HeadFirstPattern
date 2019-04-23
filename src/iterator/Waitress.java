package iterator;

import java.util.Iterator;
import java.util.List;

public class Waitress {


//    private Menu pancakeHouseMenu;
//    private Menu dinerMenu;
//    private Menu cafeMenu;

    private List<Menu> menuList;

    public Waitress(List<Menu> menus){
//        pancakeHouseMenu = new PancakeHouseMenu();
//        dinerMenu = new DinerMenu();
//        cafeMenu = new CoffeeMenu();
        menuList = menus;
    }

    public void printMenu(){
        //print pancake menu
//        for (int i=0; i<pancakeHouseMenu.getMenuItems().size(); i++){
//            MenuItem menuItem = pancakeHouseMenu.getMenuItems().get(i);
//            System.out.println(menuItem);
//        }
//        Iterator<MenuItem> iterator = pancakeHouseMenu.createIterator();
//        printIterator(iterator);

        //print lunch menu
//        for (int i=0; i<dinerMenu.getItems().length; i++){
//            MenuItem menuItem = dinerMenu.getItems()[i];
//            System.out.println(menuItem);
//        }
//        Iterator<MenuItem> iterator1 = dinerMenu.createIterator();
//        printIterator(iterator1);
//
//        Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
//        printIterator(cafeIterator);

        Iterator<Menu> it = menuList.iterator();
        while (it.hasNext()){
            printIterator(it.next().createIterator());
        }
    }

    public void printBeaekfastMenu(){
//        Iterator<MenuItem> it = pancakeHouseMenu.createIterator();
//        printIterator(it);
    }

    public void printLunchMenu(){
//        Iterator<MenuItem> it = dinerMenu.createIterator();
//        printIterator(it);
    }

    public void printVegetarianMenu(){
//        Iterator<MenuItem> it = pancakeHouseMenu.createIterator();
//        while (it.hasNext()){
//            MenuItem menuItem = it.next();
//            if (menuItem.isVegetarian() == true){
//                System.out.println(menuItem);
//            }
//        }
//
//        Iterator<MenuItem> iterator = dinerMenu.createIterator();
//        while (iterator.hasNext()){
//            MenuItem menuItem = iterator.next();
//
//            if (menuItem.isVegetarian()){
//                System.out.println(menuItem);
//            }
//        }
    }

    public boolean isMenuVegetarian(MenuItem item){
        return item.isVegetarian();
    }

    private void printIterator(Iterator<MenuItem> iterator){
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
