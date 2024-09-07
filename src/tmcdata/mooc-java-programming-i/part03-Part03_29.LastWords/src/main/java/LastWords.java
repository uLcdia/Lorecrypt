
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text;
        do {
            text = scanner.nextLine();

            String[] words = text.split(" ");

            System.out.println(words[words.length - 1]);

        } while (text.length() > 0);

        scanner.close();
    }
}
