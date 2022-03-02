
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GradeKeeper gk = new GradeKeeper();
        UserInterface ui = new UserInterface(gk,sc);
        ui.start();

        // Write your program here -- consider breaking the program into 
        // multiple classes.

    }
}
