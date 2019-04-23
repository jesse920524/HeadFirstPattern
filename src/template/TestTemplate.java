package template;

import template.with_hook.CaffeineBeverageWithHook;
import template.with_hook.CoffeeWithHook;

import java.util.Iterator;

public class TestTemplate {
    public static void main(String[] args) {
        CaffeineBeverageWithHook beverage = new CoffeeWithHook();
        beverage.prepareRecipe();
    }
}
