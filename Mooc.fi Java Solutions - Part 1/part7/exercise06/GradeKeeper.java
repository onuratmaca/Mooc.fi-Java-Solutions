import java.util.ArrayList;

public class GradeKeeper {
    private ArrayList<Integer> grades;
    private ArrayList<Integer> passingGrades;

    public GradeKeeper() {
        this.grades = new ArrayList<>();
        this.passingGrades = new ArrayList<>();
    }

    public void add(int input) {
        if (input >= 0 && input < 101) {
            grades.add(input);
            if (input > 49) {
                passingGrades.add(input);
            }
        }
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public ArrayList<Integer> getPassingGrades() {
        return this.passingGrades;
    }

    public double average(ArrayList<Integer> list) {
        double sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum / list.size();
    }

    public String printStars(int amount) {
        String output = "";
        for (int i = 0; i < amount; i++) {
            output += "*";
        }
        return output;
    }

    public void gradeDistribution(ArrayList<Integer> list) {
        System.out.println("Grade distribution:");
        int grade5, grade4, grade3, grade2, grade1, failed;
        grade5 = grade4 = grade3 = grade2 = grade1 = failed = 0;
        for (int i : list) {
            if (i >= 90) {
                grade5++;
            } else if (i >= 80) {
                grade4++;
            } else if (i >= 70) {
                grade3++;
            } else if (i >= 60) {
                grade2++;
            } else if (i >= 50) {
                grade1++;
            } else {
                failed++;
            }
        }

        System.out.println("5:" + printStars(grade5));
        System.out.println("4:" + printStars(grade4));
        System.out.println("3:" + printStars(grade3));
        System.out.println("2:" + printStars(grade2));
        System.out.println("1:" + printStars(grade1));
        System.out.println("0:" + printStars(failed));

    }
}
