package decor.component;

import decor.component.Beverage;

public class DarkRoast extends Beverage {
    private static final String TAG = "DarkRoast";

    @Override
    public String getDescription() {
        return TAG;
    }

    @Override
    public double cost() {
        switch (super.getSize()){
            case TALL:
                return 0.99;
            case GRANDE:
                return 1.49;
            case VENTI:
                return 1.99;
                default:
                    return 1.49;
        }
    }
}
