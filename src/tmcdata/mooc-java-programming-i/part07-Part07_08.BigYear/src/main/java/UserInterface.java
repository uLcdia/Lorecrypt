import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Database database;

    public UserInterface(Scanner scanner, Database database) {
        this.scanner = scanner;
        this.database = database;
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = this.scanner.nextLine();
            if (command.equals("Add")) {
                this.add();
            } else if (command.equals("Observation")) {
                this.observation();
            } else if (command.equals("All")) {
                this.all();
            } else if (command.equals("One")) {
                this.one();
            } else if (command.equals("Quit")) {
                break;
            } else {
                System.out.println("Unknown command");
            }
        }
    }

    public void add() {
        System.out.print("Name: ");
        String name = this.scanner.nextLine();
        System.out.print("Name in Latin: ");
        String latinName = this.scanner.nextLine();
        this.database.addEntry(new Entry(name, latinName));
    }

    public void observation() {
        System.out.print("Bird? ");
        String observation = this.scanner.nextLine();
        if (!this.database.observe(observation)) {
            System.out.println("Not a bird!");
        }
    }

    public void all() {
        this.database.getEntries().forEach(System.out::println);
    }

    public void one() {
        System.out.print("Bird? ");
        String name = this.scanner.nextLine();
        Entry entry = this.database.getEntry(name);
        if (entry == null) {
            System.out.println("Not a bird!");
        } else {
            System.out.println(entry);
        }
    }
}

