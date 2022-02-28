
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container containerOne = new Container();
        Container containerTwo = new Container();


        while (true) {
            System.out.println("First: " + containerOne.toString());
            System.out.println("Second: " + containerTwo.toString());

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (command.equals("add")) {
                if (containerOne.contains() + amount >= containerOne.getCapacity()) {
                    containerOne.setContainer(containerOne.getCapacity());
                } else if (amount > 0) {
                    containerOne.add(amount);
                }
            } else if (command.equals("move")) {
                if (containerOne.contains() > amount) {
                    if (containerTwo.contains() + amount > containerTwo.getCapacity()) {
                        containerTwo.setContainer(containerTwo.getCapacity());
                        containerOne.remove(amount);
                    } else if (containerTwo.contains() < amount) {
                        containerTwo.add(amount);
                        containerOne.remove(amount);
                    }
                } else {
                    containerTwo.add(containerOne.contains());
                    containerOne.remove(containerOne.contains());
                }

            } else if (command.equals("remove")) {
                if (containerTwo.contains() < amount) {
                    containerTwo.setContainer(0);
                } else {
                    containerTwo.remove(amount);
                }
            }
        }
    }
}

