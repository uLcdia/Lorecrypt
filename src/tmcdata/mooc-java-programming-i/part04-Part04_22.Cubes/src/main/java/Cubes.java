
import java.util.Scanner;
import java.lang.Math;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int EXPONENT = 3;

        while (true) {
            String input = scanner.nextLine();

            if (!input.equals("end")) {
                System.out.println((int)Math.pow(Integer.parseInt(input), EXPONENT));
            } else {
                break;
            }
        }

        scanner.close();

    }
}
