
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= count; ++i) {
            System.out.println(i);
        }

        scanner.close();

    }
}
