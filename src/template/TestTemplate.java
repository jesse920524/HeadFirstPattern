package template;

import template.with_hook.CaffeineBeverageWithHook;
import template.with_hook.CoffeeWithHook;

public class TestTemplate {
    public static void main(String[] args) {
        CaffeineBeverageWithHook beverage = new CoffeeWithHook();
        beverage.prepareRecipe();
    }
}
