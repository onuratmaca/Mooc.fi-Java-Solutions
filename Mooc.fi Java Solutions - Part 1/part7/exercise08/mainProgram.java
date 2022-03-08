
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        Scanner scan = new Scanner(System.in);
        BirdDatabase BD = new BirdDatabase();
        while (true) {
            System.out.print("? ");
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();
                BD.add(new Bird(name, latinName));
            } else if (input.equalsIgnoreCase("observation")) {
                System.out.print("Bird? ");
                String bird = scan.nextLine();
                BD.addOneObservation(bird);
            } else if (input.equalsIgnoreCase("all")) {
                BD.printAll();
            } else if (input.equalsIgnoreCase("one")) {
                System.out.print("Bird? ");
                String bird = scan.nextLine();
                BD.printOne(bird);
            } else if (input.equalsIgnoreCase("quit")) {
                break;
            }
        }


    }

}
