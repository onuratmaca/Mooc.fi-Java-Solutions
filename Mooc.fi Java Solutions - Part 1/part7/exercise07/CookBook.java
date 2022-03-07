import java.util.ArrayList;

public class CookBook {
    private ArrayList<Recipe> cookBook;

    public CookBook() {
        this.cookBook = new ArrayList<>();
    }

    public void add(Recipe recipe) {
        this.cookBook.add(recipe);
    }

    public void list() {
        for (Recipe r : this.cookBook) {
            System.out.println(r.getName() + ", cooking time: " + r.getCookingTime());
        }
    }


    public void findByCookingTime(int cookingTime) {
        for (Recipe r : this.cookBook) {
            if (r.getCookingTime() <= cookingTime) {
                System.out.println(r.getName() + ", cooking time: " + r.getCookingTime());
            }
        }
    }

    public void findByIngredient(String name){
        for(Recipe r : this.cookBook){
            if(r.getIngredientsList().contains(name)){
                System.out.println(r.getName() + ", cooking time: " + r.getCookingTime());
            }
        }
    }

    public void findByName(String name) {
        for (Recipe r : this.cookBook) {
            if (r.getName().contains(name)) {
                System.out.println(r.getName() + ", cooking time: " + r.getCookingTime());
            }
        }
    }
}
