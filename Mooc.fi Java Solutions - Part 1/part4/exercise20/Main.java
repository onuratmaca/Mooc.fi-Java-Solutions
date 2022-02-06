import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();


        // implement here the program that allows the user to enter
        // book information and to examine them
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.equals("")) {
                break;
            }
            System.out.print("Pages: ");
            int page = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            books.add(new Book(title, page, year));
        }
        System.out.print("What information will be printed? ");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("everything")) {
            for (Book book : books) {
                System.out.println(book.getName() + ", " + book.getPageCount() + " pages, " + book.getYear());
            }
        } else if (input.equalsIgnoreCase("name")) {
            for (Book book : books) {
                System.out.println(book.getName());
            }
        }

    }
}
