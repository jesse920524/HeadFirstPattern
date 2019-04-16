package template.with_hook;

public abstract class CaffeineBeverageWithHook {

    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (wantCondiments()){
            addCondiments();
        }
    }

    public void boilWater(){
        System.out.println("boil water");
    }

    public abstract void brew();

    public void pourInCup(){
        System.out.println("pour in cup");
    }

    public abstract void addCondiments();

    /** hook method
     * */
    public boolean wantCondiments(){
        return true;
    }
}
