
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        while (true) {
            if (!scanner.nextLine().equals("end")) {
                count++;
            } else {
                break;
            }
        }

        scanner.close();

        System.out.println(count);

    }
}
