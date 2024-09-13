
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");

        String fileName = scanner.nextLine();

        scanner.close();

        try {
            Files.lines(Paths.get(fileName))
                 .map(line -> line.split(","))
                 .forEach(parts -> {
                    String name = parts[0].trim();
                    String ageString = parts[1].trim();
                    System.out.println(name + ", age: " + ageString + " years");
                 });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
