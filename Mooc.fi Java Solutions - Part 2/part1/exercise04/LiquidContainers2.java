
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
            int parameter = Integer.valueOf(parts[1]);
            if (command.equals("add")) {
                containerOne.add(parameter);
            } else if (command.equals("move")) {
                if (containerOne.contains() >= parameter) {
                    containerOne.remove(parameter);
                    containerTwo.add(parameter);
                } else {
                    containerTwo.add(containerOne.contains());
                    containerOne.remove(containerOne.contains());
                }
            } else if (command.equals("remove")) {
                containerTwo.remove(parameter);
            }

        }
    }
}
