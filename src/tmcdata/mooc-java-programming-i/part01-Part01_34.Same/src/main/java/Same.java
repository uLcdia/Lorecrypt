
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Password?");

        String string1 = scan.nextLine();
        String string2 = scan.nextLine();

        if (string1.equals(string2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

        scan.close();

    }
}
