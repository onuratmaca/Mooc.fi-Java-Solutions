
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum =0;
        int counter = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input >= 0) {
                sum += input;
                counter++;
                if (input == 0 && sum == 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                }
                if (input == 0 && sum > 0) {
                    counter--;
                    System.out.println(sum / counter);
                    break;
                }
            }
        }
    }
}

