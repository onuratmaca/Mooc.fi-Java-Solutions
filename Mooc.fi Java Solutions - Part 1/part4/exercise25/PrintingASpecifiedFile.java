
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // asking user the filename
        System.out.println("Which file should have its contents printed? ");
        String fileName = scanner.nextLine();

        // creating file scanner
        while (true) {
            try {
                Scanner fileScanner = new Scanner(Paths.get(fileName));
                while (fileScanner.hasNextLine()) {

                    String row = fileScanner.nextLine();

                    System.out.println(row);
                }
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
