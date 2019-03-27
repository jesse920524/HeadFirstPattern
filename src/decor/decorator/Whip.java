package decor.decorator;

import decor.component.Beverage;

public class Whip extends Decorator {
    private static final String TAG = "Whip";

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + TAG;
    }

    @Override
    public double cost() {
        double cost = 0;
        switch (getSize()){
            case TALL:
                cost = 0.30;
                break;
            case GRANDE:
                cost = 0.60;
                break;
            case VENTI:
                cost = 0.90;
                break;
        }
        return getBeverage().cost() + cost;
    }


}
