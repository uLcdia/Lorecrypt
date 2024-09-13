
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        scanner.close();

        try {
            System.out.printf("Numbers: %d",
                Files.lines(Paths.get(file))
                .map(String::trim)
                .mapToInt(Integer::valueOf)
                .filter(num -> num >= lowerBound && num <= upperBound)
                .count());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
