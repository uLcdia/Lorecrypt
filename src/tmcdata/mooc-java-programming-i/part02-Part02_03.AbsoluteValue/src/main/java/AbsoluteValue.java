
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(Math.abs(Integer.parseInt(scanner.nextLine())));

        scanner.close();

    }
}
