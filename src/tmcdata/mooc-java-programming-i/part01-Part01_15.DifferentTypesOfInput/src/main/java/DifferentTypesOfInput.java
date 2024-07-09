
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String stringInput = scan.nextLine();

        System.out.println("Give an integer:");
        int intInput = Integer.parseInt(scan.nextLine());

        System.out.println("Give a double:");
        double doubleInput = Double.parseDouble(scan.nextLine());

        System.out.println("Give a boolean:");
        Boolean booleanInput = Boolean.parseBoolean(scan.nextLine());

        System.out.println("You gave the string " + stringInput);
        System.out.println("You gave the integer " + intInput);
        System.out.println("You gave the double " + doubleInput);
        System.out.println("You gave the boolean " + booleanInput);
    
        scan.close();

    }
}
