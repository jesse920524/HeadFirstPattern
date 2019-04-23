package iterator.composite;

public class CompositeWaitress {
    private MenuComponent menuComponent;

    public CompositeWaitress(MenuComponent menuComponent){
        this.menuComponent = menuComponent;
    }

    public void printMenu(){
        menuComponent.print();
    }
}
