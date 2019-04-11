package adapter.duckAdapter;

/**
 * Created by Jesse Fu on 2019-04-06.
 */
public class MallardDuck implements IDuck {
    private static final String TAG = "MallardDuck";

    @Override
    public void quack() {
        System.out.println(TAG + " quack!");
    }

    @Override
    public void fly() {
        System.out.println(TAG + " fly");
    }
}
