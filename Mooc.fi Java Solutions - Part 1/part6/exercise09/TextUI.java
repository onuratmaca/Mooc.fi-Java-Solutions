import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            if (input.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                dictionary.add(word, translation);
            } else if (input.equals("search")) {
                System.out.print("To be translated: ");
                String tbTranslated = scanner.nextLine();
                String translation = this.dictionary.translate(tbTranslated);
                if (translation == null) {
                    System.out.println("Word " + tbTranslated + " was not found.");
                } else {
                    System.out.println("Translation: " + this.dictionary.translate(tbTranslated));

                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}

