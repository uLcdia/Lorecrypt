import java.util.Scanner;
import java.util.Map;
import java.util.Collections;

public class UserInterface {
    private Scanner scanner;
    private Grades grades;

    public UserInterface(Scanner scanner, Grades grades) {
        this.scanner = scanner;
        this.grades = grades;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int grade = Integer.parseInt(this.scanner.nextLine());
            if (grade == -1) {
                break;
            }
            if (grade >= 0 && grade <= 100) {
                this.grades.addGrade(grade);
            }
        }

        double average = this.grades.average();
        double passingAverage = this.grades.passingAverage();
        double passPercentage = this.grades.passPercentage() * 100;

        System.out.println("Point average (all): " + average);
        System.out.println("Point average (passing): " + (passingAverage == -1 ? "-" : passingAverage));
        System.out.println("Pass percentage: " + passPercentage);

        System.out.println("Grade distribution:");
        for (Map.Entry<Integer, Integer> entry : this.grades.gradeDistribution().entrySet()) {
            String stars = String.join("", Collections.nCopies(entry.getValue(), "*"));
            System.out.println(entry.getKey() + ": " + stars);
        }
    }
}
