import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = this.scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
            if (input.equalsIgnoreCase("add")) {
                System.out.print("To add: ");
                String inputAdd = this.scanner.nextLine();
                this.list.add(inputAdd);
            } else if (input.equalsIgnoreCase("list")) {
                this.list.print();
            } else if (input.equalsIgnoreCase("remove")) {
                System.out.print("Which one is removed? ");
                int num = scanner.nextInt();
                this.list.remove(num);
            }

        }
    }
}
