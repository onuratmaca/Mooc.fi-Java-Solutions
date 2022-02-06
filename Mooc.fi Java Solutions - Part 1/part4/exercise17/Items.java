
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        String input;
        System.out.println("Name: ");
        while(true){
            input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            Item items1 = new Item(input);
            items.add(items1);
        }
        for(Item x : items){
            System.out.println(x.toString());
        }
    }
}
