package iterator.composite;

public class MenuItem extends MenuComponent {
    private static final String TAG = "MenuItem";

    private String name;
    private String description;
    private double price;
    private boolean isVegetarain;

    public MenuItem(String name, String description, double price, boolean isVegetarain) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.isVegetarain = isVegetarain;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return isVegetarain;
    }

    @Override
    public void print() {
        System.out.println(" " + getName());
        if (isVegetarian()){
            System.out.println("(v) " );
        }
        System.out.println(" " + getDescription());
        System.out.println(" " + getPrice());

    }
}
