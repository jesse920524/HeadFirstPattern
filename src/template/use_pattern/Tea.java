package template.use_pattern;

public class Tea extends CaffeineBeverage {
    private static final String TAG = "Tea";

    @Override
    public void brew() {
        System.out.println("steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("add lemon");
    }


}
