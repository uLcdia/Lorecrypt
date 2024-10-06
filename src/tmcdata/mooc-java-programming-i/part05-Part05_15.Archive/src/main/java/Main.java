
import java.util.Scanner;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> archive = new HashMap<String, String>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            if (!archive.containsKey(identifier)) {
                archive.put(identifier, name);
            }
        }
        scanner.close();
        System.out.println("==Items==");
        for (String key : archive.keySet()) {
            System.out.println(key + ": " + archive.get(key));
        }
    }
}
