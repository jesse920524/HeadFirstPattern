package decor;

import decor.component.Beverage;
import decor.component.DarkRoast;
import decor.component.Espresso;
import decor.decorator.Milk;
import decor.decorator.Mocha;
import decor.decorator.Whip;

public class TestDecorator {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());

        Beverage darkRoast = new DarkRoast();
        Beverage mocha = new Mocha(darkRoast);
        Beverage mocha1 = new Mocha(mocha);
        Beverage whip = new Whip(mocha1);
        System.out.println(whip.getDescription() + " $ " + whip.cost());

        Beverage espresso = new Espresso();
        espresso.setSize(Beverage.Size.VENTI);
        Beverage milk = new Milk(espresso);
        Beverage whip1 = new Whip(milk);

        System.out.println(whip1.getDescription() + " $ " + whip1.cost());


    }
}
