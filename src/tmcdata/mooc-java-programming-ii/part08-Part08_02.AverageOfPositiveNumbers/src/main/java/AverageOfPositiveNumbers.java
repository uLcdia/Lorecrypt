
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input);
                if (number > 0) {
                    sum += number;
                    count++;
                } else if (number == 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
        }

        scanner.close();

        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double) sum / count);
        }
    }
}
