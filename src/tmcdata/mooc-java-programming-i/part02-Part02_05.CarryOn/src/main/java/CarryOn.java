
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Shall we carry on?");
        } while (!scanner.nextLine().equals("no"));

        scanner.close();

    }
}
