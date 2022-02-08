
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try {
            Scanner fileScanner = new Scanner(Paths.get(file));
            while (fileScanner.hasNextLine()) {
                lines.add(fileScanner.nextLine());
            }

        } catch (IOException e) {
            System.out.println("Reading the file " + file + " failed");
        }

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        if (lines.contains(searchedFor)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
    }
}
