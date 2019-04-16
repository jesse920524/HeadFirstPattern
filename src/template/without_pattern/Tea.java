package template.without_pattern;

public class Tea {

    /**茶的制作步骤*/
    public final void prepareRecipe(){
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    /**烧水*/
    public void boilWater(){
        System.out.println("boil water");
    }

    /**浸入茶包*/
    public void steepTeaBag(){
        System.out.println("steeping tea bag");
    }

    /**倒入杯子*/
    public void pourInCup(){
        System.out.println("pour in cup");
    }

    /**添加柠檬*/
    public void addLemon(){
        System.out.println("add lemon");
    }
}
