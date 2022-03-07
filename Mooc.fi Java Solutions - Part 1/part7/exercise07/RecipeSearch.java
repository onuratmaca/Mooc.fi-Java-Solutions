
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {
    // TODO:

    public static void main(String[] args) {
        CookBook cb = new CookBook();
        ArrayList<String> recipes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String input = scanner.nextLine();
        System.out.print("\nCommands:\nlist - lists the recipes\nstop - stops the program" +
                "\nfind name = searches recipes by name" +
                "\nfind cooking time - searches recipes by cooking time" +
                "\nfind ingredient - searches recipes by ingredient\n");
        getRecipes(input, recipes, cb);
        while (true) {
            System.out.print("\nEnter command:");
            String inputCommand = scanner.nextLine();
            if (inputCommand.equals("stop")) {
                break;
            }
            if (inputCommand.equals("list")) {
                System.out.println("Recipes:");
                cb.list();
            }
            if (inputCommand.equals("find name")) {
                System.out.print("Searched word:");
                String searched = scanner.nextLine();
                cb.findByName(searched);
            }
            if (inputCommand.equals("find cooking time")) {
                System.out.print("Max cooking time:");
                int time = Integer.valueOf(scanner.nextLine());
                cb.findByCookingTime(time);
            }
            if (inputCommand.equals("find ingredient")) {
                System.out.print("Ingredient:");
                String ingredient = scanner.nextLine();
                cb.findByIngredient(ingredient);
            }
        }
    }

    public static void getRecipes(String input, ArrayList<String> list, CookBook cb) {
        try (Scanner reader = new Scanner(Paths.get(input))) {
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                if (row.equals("") || !reader.hasNextLine()) {
                    Recipe r = new Recipe(list.get(0), Integer.valueOf(list.get(1)));
                    list.remove(0);
                    list.remove(0);
                    for (int i = 0; i < list.size(); i++) {
                        r.fillIngredients(list.get(i));
                    }
                    cb.add(r);
                    list.clear();
                    continue;
                }
                list.add(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
