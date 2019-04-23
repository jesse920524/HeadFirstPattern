package iterator.composite;

public class CompositeMenuTestDrive {
    public static void main(String[] args) {
        //各餐厅的菜单
        MenuComponent pancakeMenu = new Menu("Pancake House Menu", "welcome");
        MenuComponent dinerMenu = new Menu("Diner Menu", " ");
        MenuComponent cafeMenu = new Menu("Cafe Menu", "relex");
        //甜点菜单是小馆子菜单的子菜单
        MenuComponent dessertMenu = new Menu("Dessert Menu", "Sweet");

        //总菜单
        MenuComponent allMenus = new Menu("All Menus", " ");

        allMenus.add(pancakeMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("pasta", "pasta", 3.89, true));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("apple pie", "pie", 1.59, true));

        pancakeMenu.add(new MenuItem("pancake1", " ", 1.99, true));

        cafeMenu.add(new MenuItem("americano", " ", 0.99, true));
        CompositeWaitress waitress = new CompositeWaitress(allMenus);
        waitress.printMenu();
    }
}
