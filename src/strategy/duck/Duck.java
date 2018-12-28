package strategy.duck;

import strategy.quack.QuackBehavior;
import strategy.fly.FlyBehavior;

public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck(){

    }

    public Duck(FlyBehavior fb, QuackBehavior qb){
        this.flyBehavior = fb;
        this.quackBehavior = qb;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim(){
        System.out.println(" swimming...");
    }

    public abstract void display();

    public void performFly(){
        if (flyBehavior != null)
        flyBehavior.fly();
    }

    public void performQuack(){
        if (quackBehavior != null)
        quackBehavior.quack();
    }

}
