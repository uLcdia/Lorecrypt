
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text;
        int age;
        int maxAge = -1;
        do {
            text = scanner.nextLine();
            try {
                age = Integer.parseInt(text.split(",")[1]);
            } catch(Exception e) {
                System.err.println("Can't parse age with " + text);
                continue;
            }

            maxAge = Integer.max(age, maxAge);
        } while (text.length() > 0);

        scanner.close();

        System.out.println("Age of the oldest: " + maxAge);
    }
}
