
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a string: ");
        String word = scanner.nextLine();
        
        scanner.close();

        System.out.println((word.equals("true")) ? "You got it right!" : "Try again!");

    }
}
