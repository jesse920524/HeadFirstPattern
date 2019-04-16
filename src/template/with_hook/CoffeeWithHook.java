package template.with_hook;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    public void brew() {
        System.out.println("brew coffee");
    }

    @Override
    public void addCondiments() {
        System.out.println("add sugar and milk");
    }

    @Override
    public boolean wantCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) return true;
        else return false;
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee? y/n");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = bufferedReader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }

        if (answer == null) return "no";
        return answer;
    }
}
