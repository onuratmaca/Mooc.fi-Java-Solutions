import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private GradeKeeper gk;

    public UserInterface(GradeKeeper gradeKeeper, Scanner scanner) {
        this.scanner = scanner;
        this.gk = gradeKeeper;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = this.scanner.nextInt();
            if (input == -1) {
                break;
            }
            gk.add(input);
        }
        System.out.println("Point average (all): " + gk.average(gk.getGrades()));
        double passingPercentage = 100 * ((double) gk.getPassingGrades().size() / gk.getGrades().size());
        if (gk.getPassingGrades().isEmpty()) {
            System.out.println("Point average (passing): -");
            System.out.println("Pass percentage: 0.0");
        } else {
            System.out.println("Point average (passing): " + gk.average(gk.getPassingGrades()));
            System.out.println("Pass percentage: " + passingPercentage);
            gk.gradeDistribution(this.gk.getGrades());
        }
    }
}
