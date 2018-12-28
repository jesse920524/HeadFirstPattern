package decor;

public class Milk extends Decorator {

    public Milk(){}

    @Override
    public float cost() {
        return 1.0f;
    }

    @Override
    public String getDesc() {
        return "牛奶";
    }
}
