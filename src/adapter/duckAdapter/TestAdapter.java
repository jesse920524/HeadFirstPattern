package adapter.duckAdapter;

/**
 * Created by Jesse Fu on 2019-04-06.
 */
public class TestAdapter {
    public static void main(String[] args) {
        IDuck duck = new TurkeyAdapter(new WildTurkey());
        duck.quack();
        duck.fly();
    }
}
