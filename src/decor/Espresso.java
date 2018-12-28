package decor;

public class Espresso extends Beverage {

    public Espresso(){}

    @Override
    public float cost() {
        return 1.25f;
    }

    @Override
    public String getDesc() {
        return "意式浓缩";
    }
}
