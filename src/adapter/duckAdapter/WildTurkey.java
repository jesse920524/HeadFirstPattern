package adapter.duckAdapter;

/**
 * Created by Jesse Fu on 2019-04-06.
 */
public class WildTurkey implements ITurkey {
    private static final String TAG = "WildTurkey";

    @Override
    public void gobble() {
        System.out.println(TAG + " gobble!");
    }

    @Override
    public void fly() {
        System.out.println(TAG + " I'm flying a short distance...");
    }
}
