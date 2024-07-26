
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");

        int sum = 0;
        int count = 0;
        int evenCount = 0;
        int oddCount = 0;

        while (true) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number == -1) {
                break;
            }

            sum += number;
            ++count;
            if (number % 2 == 0) {
                ++evenCount;
            } else {
                ++oddCount;
            }
        }

        System.out.println("Thx! Bye!");

        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + (double) sum / count);
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);

        scanner.close();

    }
}
