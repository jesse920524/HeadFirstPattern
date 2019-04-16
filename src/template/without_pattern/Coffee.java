package template.without_pattern;

public final class Coffee {

    public final void prepareRecipe(){
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarMilk();
    }

    /**烧水*/
    public void boilWater(){
        System.out.println("boil water");
    }

    /**研磨咖啡*/
    public void brewCoffeeGrinds(){
        System.out.println("brew coffee grinds");
    }

    /**倒入杯子*/
    public void pourInCup(){
        System.out.println("pour in cup");
    }

    /**加入糖 奶*/
    public void addSugarMilk(){
        System.out.println("add sugar and milk");
    }
}
