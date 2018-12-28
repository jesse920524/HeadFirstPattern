package strategy.duck;

import strategy.fly.FlyBehavior;
import strategy.quack.QuackBehavior;

public class WoodDuck extends Duck {

    public WoodDuck(FlyBehavior fb, QuackBehavior qb) {
        super(fb, qb);
    }

    @Override
    public void display() {
        System.out.println(" I'm a wood duck ");
    }
}
