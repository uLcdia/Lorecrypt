
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        scan.close();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file
        // and printing the read records

        try {
            Files.lines(Paths.get(file))
                 .map(line -> line.split(","))
                 .forEach(parts -> {
                    String name = parts[0].trim();
                    int ageString = Integer.parseInt(parts[1].trim());
                    persons.add(new Person(name, ageString));
                 });
        } catch (Exception e) {
            e.printStackTrace();
        }

        return persons;

    }
}
