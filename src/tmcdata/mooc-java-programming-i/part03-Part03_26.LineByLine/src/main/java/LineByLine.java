
import java.util.Scanner;
import java.util.Arrays;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text;
        do {
            text = scanner.nextLine();

            Arrays.stream(text.split(" "))
                  .forEach(System.out::println);
                  
        } while (text.length() > 0);

        scanner.close();
    }
}
