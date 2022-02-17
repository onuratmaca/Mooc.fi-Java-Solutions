
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> list = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.equals("")) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.equals("")){
                break;
            }
            Person person = new Person(identifier, name);
            if(!list.contains(person)){
                list.add(person);
            }
        }
        System.out.println("==Items==");
        for (Person p : list) {
            System.out.println(p);
        }


    }
}
