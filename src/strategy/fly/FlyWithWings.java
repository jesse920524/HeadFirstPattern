package strategy.fly;

import strategy.fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println(" fly with wings!");
    }
}
