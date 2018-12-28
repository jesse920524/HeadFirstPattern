package strategy.duck;

import strategy.quack.QuackBehavior;
import strategy.fly.FlyBehavior;

public class MallardDuck extends Duck {


    public MallardDuck(FlyBehavior fb, QuackBehavior qb) {
        super(fb, qb);
    }

    @Override
    public void display() {
        System.out.println(" I'm a MallardDuck! ");
    }
}
