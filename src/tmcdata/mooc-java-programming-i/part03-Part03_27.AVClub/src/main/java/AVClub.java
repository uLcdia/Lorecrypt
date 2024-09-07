
import java.util.Arrays;
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text;
        do {
            text = scanner.nextLine();

            Arrays.stream(text.split(" "))
                  .filter(word -> word.contains("av"))
                  .forEach(System.out::println);

        } while (text.length() > 0);

        scanner.close();
    }
}
