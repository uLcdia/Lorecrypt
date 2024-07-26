
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to? ");
        int end = Integer.parseInt(scanner.nextLine());

        System.out.println("Where from? ");
        int beginning = Integer.parseInt(scanner.nextLine());

        for (int i = beginning; i <= end; ++i) {
            System.out.println(i);
        }

        scanner.close();

    }
}
