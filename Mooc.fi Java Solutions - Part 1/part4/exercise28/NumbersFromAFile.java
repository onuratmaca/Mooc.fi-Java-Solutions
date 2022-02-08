
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try {
            Scanner fileScanner = new Scanner(Paths.get(file));

            while (fileScanner.hasNextLine()) {
                int num = Integer.valueOf(fileScanner.nextLine());
                if (num <= upperBound && num >= lowerBound) {
                    numbers.add(num);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Numbers: " + numbers.size());

    }

}
