
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text;
        int count = 0;
        int yearSum = 0;
        int nameLengthMax = 0;
        String name = "Neo";
        do {
            text = scanner.nextLine();
            try {
                yearSum += Integer.parseInt(text.split(",")[1]);
                count++;
            } catch(Exception e) {
                System.err.println("Can't parse birth year with " + text);
                continue;
            }

            if (text.split(",")[0].length() > nameLengthMax) {
                nameLengthMax = text.split(",")[0].length();
                name = text.split(",")[0];
            }
        } while (text.length() > 0);

        scanner.close();

        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (double)yearSum / count);
    }
}
