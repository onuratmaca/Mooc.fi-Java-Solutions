
import java.util.ArrayList;
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int liquidContainerOne = 0;
        int liquidContainerTwo = 0;
        final int MAX_CONTAINERS_CAN_CARRY = 100;

        while (true) {
            System.out.println("First: " + liquidContainerOne + "/" + MAX_CONTAINERS_CAN_CARRY);
            System.out.println("Second: " + liquidContainerTwo + "/" + MAX_CONTAINERS_CAN_CARRY);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int parameter = Integer.valueOf(parts[1]);
            if (parameter > 0) {
                if (command.equals("add")) {
                    liquidContainerOne += parameter;
                    if (liquidContainerOne > 100) {
                        liquidContainerOne = 100;
                    }
                } else if (command.equals("move")) {
                    if (liquidContainerOne >= parameter) {
                        liquidContainerOne -= parameter;
                        liquidContainerTwo += parameter;
                        if (liquidContainerTwo > 100) {
                            liquidContainerTwo = 100;
                        }
                    } else {
                        liquidContainerTwo += liquidContainerOne;
                        liquidContainerOne = 0;
                    }
                } else if (command.equals("remove")) {
                    liquidContainerTwo -= parameter;
                    if (liquidContainerTwo < 0) {
                        liquidContainerTwo = 0;
                    }
                }
            }
        }
    }

}
