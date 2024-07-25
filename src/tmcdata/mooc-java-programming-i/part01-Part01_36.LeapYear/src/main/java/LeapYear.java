
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int year = Integer.parseInt(scan.nextLine());

        if (year % 25 == 0) {
            if (year % 16 == 0) {
                System.out.println("The year is a leap year.");
            } else {
                System.out.println("The year is not a leap year.");
            }
        } else if (year % 4 == 0) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }

        scan.close();

    }
}
