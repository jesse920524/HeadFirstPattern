package decor.decorator;

import decor.component.Beverage;

public abstract class Decorator extends Beverage {

    private Beverage beverage;

    public Decorator(Beverage beverage) {
        this.beverage = beverage;
        setSize(beverage.getSize());
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public abstract String getDescription();

}
