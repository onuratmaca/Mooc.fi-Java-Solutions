import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;



    public Recipe(String name, int cT) {
        this.name = name;
        this.cookingTime = cT;
        this.ingredients = new ArrayList<>();
    }

    /*
    public Recipe(String name, int cT, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cT;
        this.ingredients = ingredients;
    }

     */

    public void fillIngredients(String s) {
        this.ingredients.add(s);
    }

    public String getName() {
        return name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public ArrayList<String> getIngredientsList() {
        return ingredients;
    }


}
