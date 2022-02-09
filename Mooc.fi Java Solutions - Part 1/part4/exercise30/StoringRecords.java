
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file
        // and printing the read records
        try {
            Scanner fileScanner = new Scanner(Paths.get(file));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                String[] people = line.split(",");

                String name = people[0];
                int age = Integer.valueOf(people[1]);

                persons.add(new Person(name, age));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return persons;

    }
}