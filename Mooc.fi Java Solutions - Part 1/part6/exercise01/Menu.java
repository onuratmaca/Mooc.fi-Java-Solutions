
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    // public void addMeal(String meal) adds a meal to the menu.
    // If the meal is already on the list, it should not be added again.
    // public void printMeals() prints the meals.
    // public void clearMenu() clears the menu.

    public void addMeal(String meal) {
        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }

    public void printMeals(){
        for(String m : meals){
            System.out.println(m);
        }
    }

    public void clearMenu(){
        this.meals.clear();
    }
}
