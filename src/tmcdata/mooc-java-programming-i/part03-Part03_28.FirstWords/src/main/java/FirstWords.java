
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text;
        do {
            text = scanner.nextLine();

            System.out.println(text.split(" ")[0]);

        } while (text.length() > 0);

        scanner.close();
    }
}
