
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text;
        int age;
        int maxAge = -1;
        String oldestName = "The Oracle";
        do {
            text = scanner.nextLine();
            try {
                age = Integer.parseInt(text.split(",")[1]);
            } catch(Exception e) {
                System.err.println("Can't parse age with " + text);
                continue;
            }

            if (age > maxAge) {
                maxAge = age;
                oldestName = text.split(",")[0];
            }
        } while (text.length() > 0);

        scanner.close();

        System.out.println("Name of the oldest: " + oldestName);
    }
}
