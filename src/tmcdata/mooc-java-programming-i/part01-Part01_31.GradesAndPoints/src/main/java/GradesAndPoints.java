
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int score = Integer.parseInt(scan.nextLine());

        System.out.print("Grade: ");

        if (score < 0) {
            System.out.println("impossible!");
        } else if (score < 50) {
            System.out.println("failed");
        } else if (score < 60) {
            System.out.println("1");
        } else if (score < 70) {
            System.out.println("2");
        } else if (score < 80) {
            System.out.println("3");
        } else if (score < 90) {
            System.out.println("4");
        } else if (score <= 100) {
            System.out.println("5");
        } else {
            System.out.println("incredible!");
        }

        scan.close();

    }
}
