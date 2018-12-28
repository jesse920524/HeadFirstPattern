package decor;

public class DarkRoast extends Beverage{

    public DarkRoast(){
    }

    @Override
    public float cost() {
        return 1.99f;
    }

    @Override
    public String getDesc() {
        return "深度烘培";
    }
}
