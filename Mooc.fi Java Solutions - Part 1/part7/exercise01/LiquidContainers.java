
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int MAX_CAPACITY = 100;
        int containerOne = 0;
        int containerTwo = 0;


        while (true) {
            System.out.println("First: " + containerOne + "/" + MAX_CAPACITY);
            System.out.println("Second: " + containerTwo + "/" + MAX_CAPACITY);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (command.equals("add")) {
                if (containerOne + amount >= MAX_CAPACITY) {
                    containerOne = MAX_CAPACITY;
                } else if (amount > 0) {
                    containerOne += amount;
                }
            } else if (command.equals("move")) {
                if (containerOne > amount) {
                    if (containerTwo + amount > MAX_CAPACITY) {
                        containerTwo = MAX_CAPACITY;
                        containerOne -= amount;
                    } else if (containerTwo < amount) {
                        containerTwo += amount;
                        containerOne -= amount;
                    }
                } else {
                    containerTwo += containerOne;
                    containerOne -= containerOne;
                }

            } else if (command.equals("remove")) {
                if (containerTwo < amount) {
                    containerTwo = 0;
                } else {
                    containerTwo -= amount;
                }
            }

        }
    }

}
