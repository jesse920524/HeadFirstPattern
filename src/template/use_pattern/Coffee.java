package template.use_pattern;

public class Coffee extends CaffeineBeverage {
    private static final String TAG = "Coffee";

    @Override
    public void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("add sugar and milk");
    }
}
