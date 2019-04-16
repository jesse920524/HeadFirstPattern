package template.use_pattern;

public abstract class CaffeineBeverage {

    /**这是我们的模版方法.
     *
     * */
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**所有饮料都需要先烧水, 所以烧水由基类实现*/
    public void boilWater(){
        System.out.println("boil water");
    }

    /**酿造方法 各个饮料均有自己的实现, 所以声明为抽象方法,交给衍生类自己去实现*/
    public abstract void brew();

    /**所有饮料都需要装入品牌定制的杯子 才能交给顾客 所以倒入杯子 方法由基类实现*/
    public void pourInCup(){
        System.out.println("pour in cup");
    }

    /**添加调料(奶, 糖, 柠檬) 各个饮料有自己的实现*/
    public abstract void addCondiments();
}
