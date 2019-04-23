package iterator.composite;

public abstract class MenuComponent {

    private static void throwUnsupportedException(){
        throw new UnsupportedOperationException("unsupported operation");
    }

    public void add(MenuComponent menuComponent){
        throwUnsupportedException();
    }

    public void remove(MenuComponent menuComponent){
        throwUnsupportedException();
    }

    public MenuComponent getChildAt(int i){
        throwUnsupportedException();
        return null;
    }

    public String getName(){
        throwUnsupportedException();
        return null;
    }

    public String getDescription(){
        throwUnsupportedException();
        return null;
    }

    public double getPrice(){
        throwUnsupportedException();
        return 0;
    }

    public boolean isVegetarian(){
        throwUnsupportedException();
        return false;
    }

    public void print(){
        throwUnsupportedException();
    }





}
