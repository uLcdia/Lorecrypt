
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        final int REPEAT = 3;

        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Give a word: ");
        String word = scanner.nextLine();
        
        scanner.close();

        System.out.println(word.repeat(REPEAT));

    }
}
