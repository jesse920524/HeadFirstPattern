package decor.decorator;

import com.sun.istack.internal.NotNull;
import decor.component.Beverage;

public class Milk extends Decorator {
    private static final String TAG = "Milk";

    public Milk(@NotNull Beverage beverage) {
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
                cost = 0.15;
                break;
            case GRANDE:
                cost = 0.30;
                break;
            case VENTI:
                cost = 0.45;
                break;
        }
        return getBeverage().cost() + cost;
    }
}
