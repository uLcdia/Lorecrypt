
import java.nio.file.Paths;
import java.util.Scanner;
import java.nio.file.Files;
import java.io.IOException;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");

        String fileName = scanner.nextLine();

        scanner.close();

        try {
            Files.lines(Paths.get(fileName))
                 .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
