
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Give a number:");
        } while (!scanner.nextLine().equals("4"));

        scanner.close();

    }
}
