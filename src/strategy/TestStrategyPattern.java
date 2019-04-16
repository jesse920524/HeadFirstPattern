package strategy;

import adapter.duckAdapter.IDuck;
import strategy.duck.Duck;
import strategy.duck.MallardDuck;
import strategy.duck.ModelDuck;
import strategy.duck.WoodDuck;
import strategy.fly.FlyBehavior;
import strategy.fly.FlyNoWay;
import strategy.fly.FlyWithWings;
import strategy.quack.MuteQuack;
import strategy.quack.Quack;
import strategy.quack.QuackBehavior;

public class TestStrategyPattern {

    public static void main(String[] args) {
        //init a mallard duck
        FlyBehavior flyBehavior1 = new FlyWithWings();
        QuackBehavior quackBehavior1 = new Quack();

        Duck mallardDuck = new MallardDuck(flyBehavior1, quackBehavior1);

        //init a wood duck
        FlyBehavior flyBehavior2 = new FlyNoWay();
        QuackBehavior quackBehavior2 = new MuteQuack();

        Duck woodDuck = new WoodDuck(flyBehavior2, quackBehavior2);

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.setFlyBehavior(flyBehavior1);
        modelDuck.setQuackBehavior(quackBehavior2);

        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        woodDuck.display();
        woodDuck.performQuack();
        woodDuck.performFly();

        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();

    }
}
