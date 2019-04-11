package adapter.duckAdapter;

/**
 * Created by Jesse Fu on 2019-04-06.
 */
public class TurkeyAdapter implements IDuck {
    private static final String TAG = "TurkeyAdapter";

    private ITurkey turkey;
    public TurkeyAdapter(ITurkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i=0; i<5; i++){
            turkey.fly();
        }
    }
}
