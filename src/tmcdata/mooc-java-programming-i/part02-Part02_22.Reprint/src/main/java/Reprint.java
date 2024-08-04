
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        // ask the user for how many times should the text be printed
        System.out.println("How many times?");
        Scanner scanner = new Scanner(System.in);
        int times = Integer.valueOf(scanner.nextLine());

        // then call the printText-method multiple times with a while-loop
        for (int i = 0; i < times; ++i) {
            printText();
        }

        scanner.close();
        
    }
    
    // Don't change the next line that defines the method!
    // (We aren't giving a method a parameter yet)
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
