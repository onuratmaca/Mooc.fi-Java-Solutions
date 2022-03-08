import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.todoList = list;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = this.scanner.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                break;
            } else if (input.equalsIgnoreCase("add")) {
                System.out.print("To add: ");
                String newTask = scanner.nextLine();
                this.todoList.add(newTask);
            } else if (input.equalsIgnoreCase("list")) {
                this.todoList.print();
            } else if (input.equalsIgnoreCase("remove")) {
                System.out.print("Which one is removed? ");
                int toRemove = Integer.valueOf(scanner.nextLine());
                this.todoList.remove(toRemove);
            }
        }
    }
}
