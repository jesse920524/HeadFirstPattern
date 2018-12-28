package decor;

public class Mocha extends Decorator {

    @Override
    public float cost() {
        return 0.99f;
    }

    @Override
    public String getDesc() {
        return "摩卡" + beverage.getDesc();
    }
}
