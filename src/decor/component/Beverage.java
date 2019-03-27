package decor.component;

public abstract class Beverage {

    private static final String description = "Unknown Beverage";

    private Size size;



    protected Beverage() {
        size = Size.GRANDE;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public  String getDescription(){
        return description;
    }

    public abstract double cost();

    public enum Size{
        VENTI,
        GRANDE,
        TALL
    }

}
