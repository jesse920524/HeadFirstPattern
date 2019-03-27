package decor.decorator;

import decor.component.Beverage;

public class Mocha extends Decorator {
    private static final String TAG = "Mocha";

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + TAG;
    }

    @Override
    public double cost() {
        double componentCost = 0;
        switch (getSize()){
            case TALL:
                componentCost = 0.20;
                break;
            case GRANDE:
                componentCost = 0.40;
                break;
            case VENTI:
                componentCost = 0.60;
                break;
        }
        return getBeverage().cost() + componentCost;
    }
}
