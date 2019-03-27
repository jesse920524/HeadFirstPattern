package decor.component;

import decor.component.Beverage;

public class Espresso extends Beverage {
    private static final String TAG = "Espresso";

    @Override
    public String getDescription() {
        return TAG;
    }

    @Override
    public double cost() {
        switch (getSize()){
            case TALL:
                return 0.49;
            case GRANDE:
                return 0.99;
            case VENTI:
                return 1.49;
                default:
                    return 0.99;
        }
    }
}
