import java.util.Scanner;

public class UserInterface {
    private JokeManager joker;
    private Scanner scanner;

    public UserInterface(JokeManager joker, Scanner scanner) {
        this.joker = joker;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:\n1 - add a joke\n2 - draw a joke\n3 - list jokes\nX - stop");
            String input = this.scanner.nextLine();
            if (input.equalsIgnoreCase("X")) {
                break;
            }
            if (input.equalsIgnoreCase("1")) {
                System.out.println("Write the joke to be added: ");
                String addInput = scanner.nextLine();
                this.joker.addJoke(addInput);
            } else if (input.equalsIgnoreCase("2")) {
                System.out.println("Drawing a joke: ");
                System.out.println(this.joker.drawJoke());
            } else if (input.equalsIgnoreCase("3")) {
                System.out.println("Printing jokes: ");
                this.joker.printJokes();
            }
        }
    }
}
